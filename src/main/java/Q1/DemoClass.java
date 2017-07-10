package main.java.Q1;

import org.springframework.stereotype.Component;

/**
 * Created by miral on 7/10/2017.
 */
@Component
public class DemoClass {

    public void display()
    {
        System.out.println("In display method");
    }
    public int getter()
    {
        System.out.println("In getter method");
        return 1;
    }


}
