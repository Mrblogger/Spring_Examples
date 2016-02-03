/**
 * 
 */
package com.arjunt.common.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author arjun
 *
 */
public class Test {
	
	public static void main(String args[]){
		
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"Spring-Collections.xml"});
		Customer customer = (Customer)context.getBean("customer");
		System.out.println(customer);
		
	}

}
