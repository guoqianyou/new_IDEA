package web.ajax;

import web.Head;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author GQY
 * Created by GQY on 2015/9/14.
 */
public class AjaxRequest implements Serializable {

    private static final long serialVersionUID = -938759752665532982L;
    private Head head;
    private Objects body;

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Objects getBody() {
        return body;
    }

    public void setBody(Objects body) {
        this.body = body;
    }
}
