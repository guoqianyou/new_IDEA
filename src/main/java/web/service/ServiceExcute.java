package web.service;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.ContextLoader;
import web.RequestBean;
import web.ResponseBean;

import java.lang.reflect.Method;

/**
 * @author GQY
 *         Created by GQY on 2015/9/17.
 */
public class ServiceExcute {
    static ApplicationContext applicationContext = ContextLoader.getCurrentWebApplicationContext();

    public static ResponseBean execute(RequestBean requestBean, ResponseBean responseBean) throws Exception {
        String serviceName = requestBean.getHead().getServiceName();
        Object object = applicationContext.getBean(serviceName);
        if (null != object) {
            Method method = object.getClass().getMethod("execute", RequestBean.class, ResponseBean.class);
            responseBean = (ResponseBean) method.invoke(object, requestBean, responseBean);
            return responseBean;
        } else {
            throw new Exception("没有找到对应的Service");
        }
    }


}
