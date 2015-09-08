package news.login.actin;

import javax.annotation.Resource;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.stx.news.login.beans.LoginUser;

@Controller
@Scope("prototype")
@ParentPackage("struts-default")
@Namespace(value="/login")
public class LoginAction {
	@Resource
	private LoginUser loginUser;
	@Action(value="login")
	public String lolgin(){
		
		return "";
	}
}
