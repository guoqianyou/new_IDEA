package news.login.action;

import news.login.beans.LoginUser;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope("prototype")
@ParentPackage("struts-default")
@Namespace(value="/login")
public class LoginAction {
	@Autowired
	protected LoginUser loginUser;
	@Action(value="login")
	public String lolgin(){
		
		return "";
	}
}
