package web.service;

import web.RequestBean;
import web.ResponseBean;

/**
 * @author GQY
 *         Created by GQY on 2015/9/17.
 */
public interface ServiceFull {
    ResponseBean execute(RequestBean requestBean, ResponseBean responseBean);
}
