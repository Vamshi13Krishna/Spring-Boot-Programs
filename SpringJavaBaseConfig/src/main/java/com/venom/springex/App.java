package com.venom.springex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        System.out.println("vk");
        GreetingImp1 greeting = context.getBean("greets",GreetingImp1.class);
        //call the meathod
        greeting.greets();
    }
}
