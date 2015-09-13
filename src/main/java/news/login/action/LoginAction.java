package news.login.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import web.auth.beans.LoginUser;

@Controller
@Scope("prototype")
@ParentPackage("struts-default")
@Namespace(value="/login")
public class LoginAction {

	protected LoginUser loginUser;
	@Action(value="login")
	public String lolgin(){
		
		return "";
	}
}
