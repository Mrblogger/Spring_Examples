/**
 * 
 */
package com.arjunt.common.inheritance;

/**
 * @author arjun
 *
 */
public class Car extends Vehicle {
	
	private int cc;
	private int gears;
	/**
	 * @return the cc
	 */
	public int getCc() {
		return cc;
	}
	/**
	 * @param cc the cc to set
	 */
	public void setCc(int cc) {
		this.cc = cc;
	}
	/**
	 * @return the gears
	 */
	public int getGears() {
		return gears;
	}
	/**
	 * @param gears the gears to set
	 */
	public void setGears(int gears) {
		this.gears = gears;
	}
	
	@Override
	public String toString(){
		return "My Vehicle Properties: \n"+this.getColor()+"\n"+this.getGears()+"\n"+this.getSize()+"\n"+this.getSpeed()+"\n"+this.getCc();
	}
}
