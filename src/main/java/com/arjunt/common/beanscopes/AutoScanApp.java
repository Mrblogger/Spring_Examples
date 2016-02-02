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
public class AutoScanApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"Spring-AutoScan.xml"});
		Customer customer = (Customer)context.getBean("customer");
		customer.setName("Arjun");
		customer.setAddress("PragathiNagar");
		customer.setPhone("99494148490");
		System.out.println(customer.toString());
	}

}
