package web.ajax;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import web.RequestBean;
import web.ResponseBean;
import web.service.ServiceExcute;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @author GQY
 * Created by GQY on 2015/9/14.
 */
public class AjaxAction extends ActionSupport{
    private static final long serialVersionUID = -4361321323693253764L;

    @Override
    public  String execute() throws Exception{
        AjaxRequest request = new AjaxRequest(ActionContext.getContext().getParameters());
        AjaxResponse response = new AjaxResponse();
        responseBean = ServiceExcute.execute(request, response);
        return SUCCESS;
    }
    private RequestBean requestBean;
    private ResponseBean responseBean;

    public RequestBean getRequestBean() {
        return requestBean;
    }

    public void setRequestBean(RequestBean requestBean) {
        this.requestBean = requestBean;
    }

    public ResponseBean getResponseBean() {
        return responseBean;
    }

    public void setResponseBean(ResponseBean responseBean) {
        this.responseBean = responseBean;
    }
}
