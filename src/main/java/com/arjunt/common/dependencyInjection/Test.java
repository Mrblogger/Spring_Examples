/**
 * 
 */
package com.arjunt.common.dependencyInjection;

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
		ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/resources/Spring.xml");
		OutputHelper helper = (OutputHelper)context.getBean("outputHelper");
		//OutputHelper constructorInjectionhelper = (OutputHelper)context.getBean("outputHelper1");
		helper.generateOutput();
		//constructorInjectionhelper.generateOutput();
	}

}
