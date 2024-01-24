//Program to demonstrate constructor
package com.tnsif.day3;

public class Customer {
	
	//Data members
	private String customerName;
	private String customerCity;
	private int age;
	
	//Default Constructor
	public Customer() {
		
		System.out.println("default constructor");

	}
	//Parameterized constructor

	public Customer(String customerName, String customerCity, int age) {
	System.out.println("parameterized constructor");
		this.customerName = customerName;
		this.customerCity = customerCity;
		this.age = age;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerCity() {
		return customerCity;
	}

	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerCity=" + customerCity + ", age=" + age + "]";
	}
	
	
	
	
	

}
