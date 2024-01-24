package com.tnsif.daysix.association;

public class IsADemo {
	public static void main(String[] args) {

		Employee employee = new Employee("Sagar Pawar", 101, "IT");
		Manager manager = new Manager("Ankit Kale", 201, "Hr", 8);

		System.out.println(employee);
		System.out.println("---------------------------------------------------------------");
		System.out.println(manager);
	}
}