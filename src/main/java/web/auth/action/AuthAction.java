package web.auth.action;

import com.opensymphony.xwork2.ActionSupport;
import database.MysqlDao;
import org.apache.struts2.convention.annotation.*;
import org.apache.struts2.interceptor.ServletRequestAware;
import web.auth.beans.RegisterUser;

import javax.servlet.http.HttpServletRequest;

/**
 * @author GQY
 *         登陆，注册
 */
@Namespace(value = "/login")
@ParentPackage(value = "struts-default,json-default")
@Results(value = {
        @Result(name = "register", type = "json",params = {"ignoreHierarchy","false","root","resUser"})
})
public class AuthAction extends ActionSupport implements ServletRequestAware {
    private static final long serialVersionUID = 7436094956944348014L;
    private MysqlDao mysqlDao;
    private RegisterUser registerUser;
    HttpServletRequest request;

    public void setServletRequest(HttpServletRequest request) {
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
    @Action(value = "register")

    public String execute() throws Exception {

        return super.execute();
    }


}
