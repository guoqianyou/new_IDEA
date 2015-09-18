package web.form;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import web.ResponseBean;

/**
 * @author GQY
 * Created by GQY on 2015/9/18.
 */
public class FormAction extends ActionSupport{
    private static final long serialVersionUID = -4062549801437450344L;

    @Override
    public String execute() throws Exception {
        FormRequest formRequest = new FormRequest(ActionContext.getContext().getParameters());
        FormResponse formResponse = new FormResponse();

        return super.execute();
    }
    public ResponseBean responseBean;

    public ResponseBean getResponseBean() {
        return responseBean;
    }

    public void setResponseBean(ResponseBean responseBean) {
        this.responseBean = responseBean;
    }
}
