package news.login.beans;


public class LoginUser {
	private String name;
	private String password;
	private String code;
	private String rememberMark;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getRememberMark() {
		return rememberMark;
	}
	public void setRememberMark(String rememberMark) {
		this.rememberMark = rememberMark;
	}
	
}
