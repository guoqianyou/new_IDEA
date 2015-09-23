package tool.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import utils.JsonNews;
import utils.ValidateCodeNews;

import javax.servlet.http.HttpServletRequest;
import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * @author GQY
 *         Created by GQY on 2015/9/23.
 *         验证码
 */
public class ValidateCodeAction extends ActionSupport implements SessionAware {

    private static final long serialVersionUID = 3434991812401692621L;
    private ByteArrayInputStream imgStream;
    private Map session;
    private String valCode;

    public String getValCode() {
        return valCode;
    }

    public void setValCode(String valCode) {
        this.valCode = valCode;
    }

    public void setSession(Map<String, Object> session) {
        this.session = session;
    }

    public ByteArrayInputStream getImgStream() {
        return imgStream;
    }

    public void setImgStream(ByteArrayInputStream imgStream) {
        this.imgStream = imgStream;
    }


    @Override
    public String execute() throws Exception {
        String code = ValidateCodeNews.getSecurityCode();
        imgStream = ValidateCodeNews.getImageAsInputStream(code);
        session.put("validateCode", code);
        return SUCCESS;
    }

    private String result;

    public String getResult() {
        return result;
    }

    public String valiCode() {
        Map<String, Object> resu = new HashMap<String, Object>();
        String code = (String) session.get("validateCode");
        if (null != code && code.equals(valCode)) {
            resu.put("isCode", true);
        } else {
            resu.put("isCode", false);
        }
        result = JsonNews.objectToJson(resu);
        return SUCCESS;
    }

}
