package news.service;

import exception.Loger;
import news.beans.TestBean;
import org.springframework.stereotype.Service;
import web.RequestBean;
import web.ResponseBean;
import web.service.ServiceFull;

/**
 * @author GQY
 * Created by GQY on 2015/9/17.
 */
@Service
public class FirstTest implements ServiceFull {

    public ResponseBean execute(RequestBean requestBean, ResponseBean responseBean) {
        Loger.logger.info("进入service");
        TestBean testBean = (TestBean) requestBean.getBody(TestBean.class);
        System.out.println(testBean.getBb());
        responseBean.setBody(testBean);
        return responseBean;
    }
}
