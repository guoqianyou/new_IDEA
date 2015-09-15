package web;

import javax.validation.Valid;
import java.io.Serializable;

/**
 * @author GQY
 * Created by GQY on 2015/9/14.
 */
public abstract class RequestBean implements Serializable {
    private static final long serialVersionUID = 6330843243577134804L;
    @Valid
    private Head head;
    private Object body;
    protected abstract <T>T  reload();
}
