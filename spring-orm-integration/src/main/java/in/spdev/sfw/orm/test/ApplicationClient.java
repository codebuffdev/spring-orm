package in.spdev.sfw.orm.test;

import in.spdev.sfw.orm.dao.StudentDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationClient {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("orm-config.xml");
        StudentDao studentDao = applicationContext.getBean("studentDao", StudentDao.class);
        /*
         * now we can perform dao operations
         * */
    }
}
