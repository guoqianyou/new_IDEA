package web;

import javax.validation.Valid;
import java.io.Serializable;

/**
 * @author GQY
 * Created by GQY on 2015/9/17.
 */
public class ResponseBean implements Serializable {

    private static final long serialVersionUID = -734131183200897820L;
    @Valid
    private Head head;
    @Valid
    private Object body;

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Object getBody() {
        return body;
    }

    public void setBody(Object body) {
        this.body = body;
    }
}
