package com.venom.springex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        System.out.println("2346789");
        
        Student student = context.getBean("student",Student.class);
        student.details();
    }
}
