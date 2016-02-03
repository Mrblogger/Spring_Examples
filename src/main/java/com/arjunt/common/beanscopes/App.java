/**
 * 
 */
package com.arjunt.common.beanscopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author arjun
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"Spring-Customer.xml"});
		CustomerService obj = (CustomerService)context.getBean("customerservice");
		obj.setMessage("Service Message CustomerA");
		System.out.println(obj.getMessage());
		CustomerService obj1 = (CustomerService)context.getBean("customerservice1");
		System.out.println(obj1.getMessage());
		// including the customer bean in the context to inject a Date type.
		Customer cust = (Customer)context.getBean("customer");
		System.out.println(cust.getStartDate());
		Customer cust1 = (Customer)context.getBean("custom-customer");
		System.out.println(cust1.getStartDate());
		System.out.println(cust1.getEndDate());
		

	}

}
