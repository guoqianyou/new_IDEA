package news.login.actin;

import javax.annotation.Resource;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.stx.news.login.beans.RegisterUser;

/**
 * @author guoqi
 * @see 用户注册
 */
@Controller
@Scope(value="properties")
@ParentPackage("struts-default")
@Namespace(value="/register")
public class RegisterAction {
	@Resource
	private RegisterUser registerUser;
	@Action(value="register")
	public String register(){
		
	}
	
}
