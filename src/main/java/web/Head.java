package web;



import com.fasterxml.jackson.annotation.JsonRootName;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author GQY
 * Created by GQY on 2015/9/14.
 */
@JsonRootName("head")
public class Head  implements Serializable{
    private static final long serialVersionUID = 8505758900935795915L;
    @NotNull
    private boolean isSuccess;
    @NotNull
    private String msg;
    private String serviceName;
    private String sessionId;

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }
}
