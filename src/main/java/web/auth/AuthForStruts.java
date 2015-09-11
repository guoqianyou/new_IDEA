package web.auth;

import java.util.List;

/**
 * Created by GQY on 2015/9/11.
 */

public interface AuthForStruts {
    public boolean isAuth(String auth);
    public List authList(String auth);
}
