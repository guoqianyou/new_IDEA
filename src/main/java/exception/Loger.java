package exception;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author GQY
 *         Created by GQY on 2015/9/11.
 */
public class Loger {
    //log4j   获取logger
    public static Logger logger = LogManager.getLogger("123");


    public static void main(String[] args) {
        logger.error("adfsda");
    }
}
