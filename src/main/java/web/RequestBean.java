package web;

import javax.validation.Valid;
import java.io.Serializable;

/**
 * @author GQY
 *         Created by GQY on 2015/9/14.
 */
public abstract class RequestBean implements Serializable {
    private static final long serialVersionUID = 6330843243577134804L;
    @Valid
    private Head head;
    @Valid
    private Object body;

    protected abstract <T> T reload(Class<T> clas, String name);


    public Head getHead() {
        if (null == this.head)
            this.head = reload(Head.class, "head");
        return this.head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Object getBody(Class<?> bodyClass) {
        return null == body ? reload(bodyClass, "body") : this.body;
    }

    public void setBody(Object body) {
        this.body = body;
    }
}
