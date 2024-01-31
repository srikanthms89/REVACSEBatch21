package com.tnsif.dayten.markerint;

public class MarkerDemo {

	public static void main(String[] args) {
		
		
		Student st = new Student(101,"kumar",5000,"java");
		System.out.println(st);
		
		if(st instanceof Registrable)
		{
			System.out.println("Student is Registered");
		}
		else
		{
			System.out.println("Student is not Registered ");
		}
	}

}
