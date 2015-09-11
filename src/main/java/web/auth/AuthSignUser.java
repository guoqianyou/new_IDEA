package web.auth;

import utils.Base64News;

import java.util.List;

/**
 * Created by GQY on 2015/9/11.
 */

public class AuthSignUser implements AuthForStruts {

    public boolean isAuth(String auth) {
        auth = Base64News.getDecodeString(auth);

        return false;
    }

    public List authList(String auth) {

        return null;
    }
}
