/**
 * 
 */
package com.arjunt.common;

/**
 * @author arjun
 *
 */
public class Person {

	private String name;
	private String address;
	private int age;
	
	public void setName(String name){
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getAge() {
		return age;
	}
	
	public String toString(){
		return "Name:"+ name+ " Address:"+address+" Age:"+age+" ";
	}
}
