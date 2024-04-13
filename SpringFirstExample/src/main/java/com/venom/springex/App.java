package com.venom.springex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	//start the bean
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        System.out.println("vk");
        //get the object
        Greetingsimpl greetings = context.getBean("greet",Greetingsimpl.class);
        //call the meathod
        greetings.greet();
    }
}
