package com.venom.springex.SpringJavaBaseConfigEx2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(PersonConfig.class);
        System.out.println("OBJECT CREATED");
        
        System.out.println("__________________________________");
        
        
        
        Person person= context.getBean("PersonInfo",Person.class);
        person.PersonInfo();
     
    }
}
