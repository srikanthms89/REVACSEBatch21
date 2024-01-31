package com.tnsif.dayseven.staticv;

public class EmployeeDemo {

	public static void main(String[] args) {
		// Create the first object of the class and pass the two arguments with type
		// string and int.
		System.out.println(Employee.companyName);
		System.out.println(Employee.sal);
		Employee e = new Employee("Shubh", 123);
		System.out.println(e);
		
		// Similarly, create the second object of the class and pass the two arguments.
		e = new Employee("Deep", 321);
		System.out.println(e);
	}
}
