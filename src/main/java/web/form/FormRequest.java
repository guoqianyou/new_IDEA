package web.form;

import utils.MapNews;
import web.RequestBean;

import java.util.Map;

/**
 * @author GQY
 *         Created by GQY on 2015/9/18.
 */
public class FormRequest extends RequestBean {
    private Map<String, Object> paramaters;

    public FormRequest(Map<String, Object> paramaters) {
        this.paramaters = paramaters;
    }

    @Override
    protected <T> T reload(Class<T> clas, String name) {
        Object object = MapNews.mapToObject(this.paramaters,clas);
        return (T) object;
    }
}
