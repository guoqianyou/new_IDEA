package utils;

import java.util.Map;

/**
 * @author GQY
 *         Created by GQY on 2015/9/16.
 *         处理request请求来的数据
 */
public class RequestNews {
    /**
     * 根据名字在paramters中获得数据
     *
     * @param name      在paramters中的名字
     * @param paramters 在这个paramters中获得
     * @return 返回获得的数据
     */
    public static Object getParamters(final String name, final Map<String, Object> paramters) {
        if (null == name || null == paramters.get(name)) {
            return null;
        } else {
            Object o = paramters.get(name);
            return o == null ? paramters : o;
        }
    }
}
