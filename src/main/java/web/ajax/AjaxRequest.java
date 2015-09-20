package web.ajax;

import utils.JsonNews;
import utils.RequestNews;
import web.RequestBean;

import java.util.Map;

/**
 * @author GQY
 *         Created by GQY on 2015/9/14.
 */
public class AjaxRequest extends RequestBean {

    private static final long serialVersionUID = -938759752665532982L;
    private Map<String, Object> parameters;

    public AjaxRequest(Map<String, Object> parameters) {
        this.parameters = parameters;
    }

    protected <T> T reload(Class<T> clas, String name) {
        Object object = RequestNews.getParamters(name, this.parameters);
        if (null != object) {
            return (T) JsonNews.jsonToObject(object.toString(), clas);
        }
        return null;
    }
}
