package web.auth.action;

import com.opensymphony.xwork2.ActionSupport;
import database.MysqlDao;
import database.model.UserInfomation;
import exception.Loger;
import org.apache.struts2.convention.annotation.*;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;
import utils.Base64News;
import utils.DateUtils;
import web.auth.beans.RegisterUser;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * @auther GQY
 * 用户注册antion
 * @DATE 2015/9/13
 */

@Namespace(value = "/login")
@ParentPackage(value = "struts-default")
@Results({
        @Result(name = "success", location = "/page/backadmin/index.html"),
        @Result(name = "input", location = "/page/error.jsp")
})
public class RegisterAction extends ActionSupport {
    private static final long serialVersionUID = -3079511833295511849L;
    private RegisterUser registerUser;
    private MysqlDao mysqlDao;
    private HttpServletRequest request;
    private HttpServletResponse response;

    public HttpServletResponse getResponse() {
        return response;
    }

    public void setResponse(HttpServletResponse response) {
        this.response = response;
    }

    public HttpServletRequest getRequest() {
        return request;
    }

    public void setRequest(HttpServletRequest request) {
        this.request = request;
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
//    @Validations(requiredStrings = {
//            @RequiredStringValidator(fieldName = "registerUser.password", message = "密码不能为空！"),
//            @RequiredStringValidator(fieldName = "registerUser.phone", message = "手机号不能为空！"),
//            @RequiredStringValidator(fieldName = "registerUser.email", message = "邮箱不能为空！")
//    }, regexFields = {
//            @RegexFieldValidator(fieldName = "registerUser.phone", regexExpression = "^((13[0-9])|(15[^4,\\\\D])|(18[0,5-9]))\\\\d{8}$", message = "手机号格式错误！"),
//            @RegexFieldValidator(fieldName = "registerUser.password", regexExpression = "^[a-zA-Z0-9]{6,16}$", message = "i密码中不能出现特殊字符！")
//    }, emails = {
//            @EmailValidator(fieldName = "registerUser.email", message = "E-mail格式不正确！")
//    })
    @Action(value = "register")
    public String execute() {
        WebApplicationContext ctx = ContextLoader.getCurrentWebApplicationContext();
        ctx.getBean("mysqlDao");
        Loger.logger.error("ceshi cehishi afjjdsialfjasdfjlasdjflkdas");
        UserInfomation userInfomation = saveUser(registerUser);
        HttpSession session = request.getSession();
        session.setAttribute("user", userInfomation);
        session.setAttribute("stx_auth", getsignDate(userInfomation.getId()));
        return SUCCESS;
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

    private UserInfomation saveUser(RegisterUser registerUser) {
        UserInfomation userInfomation = new UserInfomation();
        userInfomation.setPassword(registerUser.getPassword());
        userInfomation.setUserName(registerUser.getEmail());
        userInfomation.setPhoneNo(registerUser.getPhone());
        return (UserInfomation) mysqlDao.save(userInfomation);
    }


}
