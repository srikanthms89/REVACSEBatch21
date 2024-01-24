package com.tnsif.day3;

import java.util.Scanner;

public class CustomerDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String name,city;
		int age;
		System.out.println("Enter name");
		name = sc.nextLine();
		System.out.println("Enter city");
		city =sc.nextLine();
		System.out.println("Enter age");
		age = sc.nextInt();
		
		Customer  obj = new Customer ();
		
		obj.setCustomerName(name);
		obj.setCustomerCity(city);
		obj.setAge(age);
		System.out.println(obj);
		
		System.out.println(".........................");
		Customer  obj1 = new Customer (name,city,age);
		
		System.out.println("Enter name");
		sc.nextLine();
		name = sc.nextLine();
		
		System.out.println("Enter city");
		city =sc.nextLine();
	
		System.out.println("Enter age");
		age = sc.nextInt();
		obj1.setCustomerName(name);
		obj1.setCustomerCity(city);
		obj1.setAge(age);
		
		System.out.println(obj1);
		

	}

}
