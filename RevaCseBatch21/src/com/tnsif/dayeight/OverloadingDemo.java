package com.tnsif.dayeight;

public class OverloadingDemo {

	public static void main(String[] args) {

      //constructor overloading
		Point p = new Point();//Default constructor invoked
		System.out.println(p);
		
		Point p1 = new Point(4.5f);//single parameter constructor invoked
		System.out.println(p1);
		
		Point p2 = new Point(5.5f,4.5f);//Default constructor invoked
		System.out.println(p2);
		
		System.out.println("Addition two numbers" + MethodOverloading.addition(100, 200));
		System.out.println("Addition two numbers" + MethodOverloading.addition(10.f, 20.f));
		System.out.println("Addition two numbers" + MethodOverloading.addition(100, 200.0f));
		System.out.println("Addition two numbers" + MethodOverloading.addition(100.0f, 200));
		System.out.println("Addition two numbers" + MethodOverloading.addition("Reva", "cse"));





	}

}
