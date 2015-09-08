package news.test.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.stx.news.dao.MysqlDao;
import com.stx.news.model.User;


@Controller
public class UserAction {
	User user;
	@Resource
	MysqlDao<User> dao;
	public String saveUser(){
		user.setUserName("34");
		dao.save(user);
		return "SUCCESS";
	}
}
