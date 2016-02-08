/**
 * 
 */
package com.arjunt.common.inheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author arjun
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Inheritance.xml");
		Car car = (Car)context.getBean("car");
		System.out.println(car);
	}

}
