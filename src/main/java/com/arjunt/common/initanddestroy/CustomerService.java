/**
 * 
 */
package com.arjunt.common.initanddestroy;

/**
 * @author arjun
 *
 */
public class CustomerService {
	
	private String message;

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void initMethod(){
		System.out.println("Init Method is called after setting the properties");
	}
	
	public void destroyMthod(){
		System.out.println("Destroy method is called");
	}

}
