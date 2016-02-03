/**
 * 
 */
package com.arjunt.common.beanscopes;

import java.util.Date;

import org.springframework.stereotype.Component;

/**
 * @author arjun
 *
 */
@Component
public class Customer {
	
	private String name;
	private String address;
	private String phone;
	private Date startDate;
	private Date endDate;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	public String toString(){
		return "Name :"+ name+ "\nAddress :" +address+ "\nPhone# :"+phone;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	

}
