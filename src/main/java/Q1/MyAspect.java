package main.java.Q1;

import org.aspectj.lang.annotation.Before;


/**
 * Created by miral on 7/10/2017.
 */
public class MyAspect {


    @Before("execution(* DemoClass.*())")
    void displayInvoked()
    {
        System.out.println("Invoke method called before");
    }
}
