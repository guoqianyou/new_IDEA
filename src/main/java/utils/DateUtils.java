package utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author GQY
 *         Created by guoqi on 2015/9/12.
 *         时间工具
 */
public class DateUtils {
    /**
     * @param pattern 日期格式化 例如：<br>
     *                yyyyMMdd,yyyy-MM-dd 等等
     * @return 日期字符串
     */
    public static String getDate(String pattern) {
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat(pattern);
        return dateFormat.format(date);
    }

    /**
     * 获取日期 Long 类型
     * @return 数字日期
     */
    public static long getDate(){
        Date date = new Date();
        return date.getTime();
    }


}
