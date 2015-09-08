package news.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
/**
 * @author guoqi
 * @see 用户管理
 */
@Entity
@Table(name="user")
public class User implements Serializable{
	
	private static final long serialVersionUID = -3411518223185525931L;
	@Id
	@GenericGenerator(name="fatherId",strategy="")
	private String id;
	private String creatTime;
	private String userName;
	private String userPassword;
	private String userPower;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCreatTime() {
		return creatTime;
	}
	public void setCreatTime(String creatTime) {
		this.creatTime = creatTime;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserPower() {
		return userPower;
	}
	public void setUserPower(String userPower) {
		this.userPower = userPower;
	}
	
}
