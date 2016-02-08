/**
 * 
 */
package com.arjunt.common.propertyplaceholder;

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
		
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"Spring-PropertyHolder.xml"});
		MessageCenter obj = (MessageCenter)context.getBean("messageCenter");
		System.out.println(obj);

	}

}
