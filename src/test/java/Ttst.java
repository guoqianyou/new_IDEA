import database.MysqlDao;
import database.model.UserInfomation;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by guoqi on 2015/9/12.
 */
public class Ttst {
//    public static void main(String[] args) {
//        String string = "112321daidfn-adf";
//        String[] a =string.split("\\|");
//        System.out.println("args = [" + a.toString()+ "]");
//    }
    @Test
    public void ttest(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        MysqlDao dao= (MysqlDao) ctx.getBean("mysqlDao");
        UserInfomation user = new UserInfomation();
        user.setUserName("guoqianyou");
        user.setPassword("1234");
        dao.save(user);
    }
}
