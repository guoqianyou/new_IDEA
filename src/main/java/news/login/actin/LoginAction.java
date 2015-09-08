package news.login.actin;

import news.login.beans.LoginUser;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
@Scope("prototype")
@ParentPackage("struts-default")
@Namespace(value="/login")
public class LoginAction {
	@Resource
	protected LoginUser loginUser;
	@Action(value="login")
	public String lolgin(){
		
		return "";
	}
}
