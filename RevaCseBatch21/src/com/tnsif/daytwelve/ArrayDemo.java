package com.tnsif.daytwelve;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {


		
		Student arr[] = new Student[5];
		
		arr[0]= new Student(101,"punith");
		arr[1] = new Student (102,"raj");
		arr[2] = new Student (103,"raj");
		arr[3] = new Student (104,"raj");
		arr[4] = new Student (105,"raj");
		
		System.out.println("Student details " +Arrays.toString(arr));
		
		

	}

}
