package springdemo.unit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        Mobile mobile=(Mobile)applicationContext.getBean("mobile1");
        NetMan netMan=(NetMan)applicationContext.getBean("netMan");
//        netMan.readNews(mobile);
        netMan.readNews();
    }
}
