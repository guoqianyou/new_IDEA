package web;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

import java.util.Map;

/**
 * @author GQY
 *         struts2  权限拦截器
 *         Created by GQY on 2015/9/11.
 */
public class OAuthInterceptor extends AbstractInterceptor {

    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
        ActionContext ctx = invocation.getInvocationContext();
        Map session = ctx.getSession();
        String auth = (String) session.get("stx_auth");

        if (null != auth) {
        }
        return Action.LOGIN;
    }

}
