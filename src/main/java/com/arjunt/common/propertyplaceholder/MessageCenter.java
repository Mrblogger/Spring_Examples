/**
 * 
 */
package com.arjunt.common.propertyplaceholder;

/**
 * @author arjun
 *
 */
public class MessageCenter {
	
	private String welcomemsg;
	private String goodbyemsg;
	
	public String getWelcomemsg() {
		return welcomemsg;
	}
	public void setWelcomemsg(String welcomemsg) {
		this.welcomemsg = welcomemsg;
	}
	public String getGoodbyemsg() {
		return goodbyemsg;
	}
	public void setGoodbyemsg(String goodbyemsg) {
		this.goodbyemsg = goodbyemsg;
	}
	
	@Override
	public String toString(){
		return "Messages Configured: \nWelcome:" + welcomemsg+"\nGoodBye" +goodbyemsg;
	}
}
