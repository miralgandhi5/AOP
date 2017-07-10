package main.java.Q1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by miral on 7/10/2017.
 */
public class Executor {
    public static void main(String[] args) {


        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("main/resources/spring-config.xml");
        DemoClass demoClass = (DemoClass) applicationContext.getBean("demo");
        demoClass.display();


    }

}
