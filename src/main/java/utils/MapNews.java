package utils;

import exception.Loger;
import org.apache.commons.beanutils.BeanUtils;

import java.util.Map;

/**
 * @author GQY
 *         处理map类的数据
 *         Created by GQY on 2015/9/18.
 */
public class MapNews {
    public static <T> T mapToObject(Map<String, Object> map, Class<T> clas) {
        if (null != map && null != clas) {
            Object object;
            try {
                object = clas.newInstance();
                BeanUtils.populate(object, map);
            } catch (Exception e) {
                Loger.logger.error("Map->Object 转化错误！");
                return null;
            }
            return (T) object;
        }else{
            Loger.logger.warn("值为空！");
            return null;
        }
    }
}
