package web.auth.intercept;

import database.MysqlDao;
import database.MysqlDaoImpl;
import database.model.UserInfomation;
import org.springframework.stereotype.Component;
import utils.Base64News;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * @author GQY
 *         用户认证
 *         Created by GQY on 2015/9/11.
 */
@Component
public class AuthSignUser {
    private static HashMap<String, Object> users = new HashMap<String, Object>();
    private static MysqlDao mysqlDao = new MysqlDaoImpl();

    static {
        List<UserInfomation> userInfo = mysqlDao.find("from UserInfomation");
        if (userInfo != null) {
            for (UserInfomation usee : userInfo) {
                users.put(usee.getId(), usee);
            }
        }
    }

    /**
     * 是否有权限访问
     * @param auth 访问权限码
     * @return true： 有权限。
     */
    public static boolean isAuth(String auth) {
        auth = Base64News.getDecodeString(auth);
        if (auth != null) {
            //auth 字符串 为 用户访问凭证。 格式为 yyyyMMddHHmmss|userId
            String[] auths = auth.split("\\|");
            if (auths.length == 2) {
                String time = auths[0];
                String userId = auths[1];
                if (inTime(time) && null!=users.get(userId)){
                    return true;
                }
            }

        }
        return false;
    }

    /**
     * 判断是否在有效时间内。有效时间为30分钟
     *
     * @param time 用户上次访问时间
     * @return true：在有效时间<br>
     * false:超出有效时间。或时间格式错误！
     */
    private static boolean inTime(String time) {
        Calendar calendar = Calendar.getInstance();
        Date date = new Date();
        long now = date.getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        try {
            date = dateFormat.parse(time);
        } catch (ParseException e) {
            return false;
        }
        calendar.setTime(date);
        calendar.add(Calendar.MINUTE, 30);
        date = calendar.getTime();
        return now < date.getTime();
    }

}
