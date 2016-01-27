package com.arjunt.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args )
    {
    	ApplicationContext context = new FileSystemXmlApplicationContext("file:src/main/resources/Spring-Module.xml");
    	HelloWorld obj = (HelloWorld)context.getBean("helloBean");
    	obj.printHello();
    }
}
