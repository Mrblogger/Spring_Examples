/**
 * 
 */
package com.arjunt.common.beanscopes;

/**
 * @author arjun
 *
 */
public class CustomerService {
	
	private String message = "Default Message";
	
	public void setMessage(String message){
		this.message = message;
	}
	
	public String getMessage(){
		return message;
	}

}
