package web.auth.action;

import com.opensymphony.xwork2.ActionSupport;
import database.MysqlDao;
import database.model.UserInfomation;
import exception.Loger;
import org.apache.struts2.convention.annotation.*;
import org.apache.struts2.interceptor.SessionAware;
import utils.Base64News;
import utils.DateUtils;
import utils.JsonNews;
import web.auth.beans.RegisterUser;

import java.util.HashMap;
import java.util.Map;


/**
 * @auther  GQY
 * 用户注册antion
 * @DATE  2015/9/13
 */

@Namespace(value = "/login")
@ParentPackage(value = "json-default")
@Results({
        @Result(name = "success", location = "/page/backadmin/index.html"),
        @Result(name = "input", location = "/page/error.jsp"),
        @Result(name = "json", type = "json", params = {
                "root", "result"
        })
})
public class RegisterAction extends ActionSupport implements SessionAware {
    private static final long serialVersionUID = -3079511833295511849L;
    private RegisterUser registerUser;
    private MysqlDao mysqlDao;
    private Map session;
    private String result;
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getResult() {
        return result;
    }


    public MysqlDao getMysqlDao() {
        return mysqlDao;
    }

    public void setMysqlDao(MysqlDao mysqlDao) {
        this.mysqlDao = mysqlDao;
    }

    public RegisterUser getRegisterUser() {
        return registerUser;
    }

    public void setRegisterUser(RegisterUser registerUser) {
        this.registerUser = registerUser;
    }

    @Override
    @Action(value = "register")
    public String execute() {
        Loger.logger.error("用户注册");
        String userId = saveUser(registerUser);
        session.put("stx_auth", getsignDate(userId));
        return SUCCESS;
    }

    @Action(value = "checkEmail")
    public String checkEmail() {
        long cou = mysqlDao.count("select count(*) from UserInfomation where username='" + email + "'");
        Map map = new HashMap();
        if (cou == 0) {
            map.put("check", true);
        } else {
            map.put("check", false);
        }
        result = JsonNews.objectToJson(map);
        return "json";
    }


    /**
     * 获取加密后的 auth字符串
     *
     * @param userId 用户Id
     * @return 返回 yyyyMMddHHmmss|userId (base64)
     */
    private static String getsignDate(String userId) {
        String sign = DateUtils.getDate("yyyyMMddHHmmss") + "\\|" + userId;
        return Base64News.getEncodString(sign);
    }

    private String saveUser(RegisterUser registerUser) {
        UserInfomation userInfomation = new UserInfomation();
        userInfomation.setPassword(registerUser.getPassword());
        userInfomation.setUserName(registerUser.getEmail());
        userInfomation.setRealName(registerUser.getRealName());
        return (String) mysqlDao.save(userInfomation);
    }


    public void setSession(Map<String, Object> session) {
        this.session = session;
    }
}
