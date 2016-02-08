/**
 * 
 */
package com.arjunt.common.initanddestroy;

import org.springframework.context.ConfigurableApplicationContext;
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
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"Spring-InitAndDestroy.xml"});
		CustomerService c = (CustomerService)context.getBean("customer");
		System.out.println(c);
		context.close();
	}

}
