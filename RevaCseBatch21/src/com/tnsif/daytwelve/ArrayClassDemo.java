package com.tnsif.daytwelve;

import java.util.Arrays;

public class ArrayClassDemo {

	public static void main(String[] args) {

		// Get the Array
		int intArr[] = { 10, 20, 15, 22, 35, 18 , 14 };

		// To print the elements in one line
		System.out.println("Array is : "+Arrays.toString(intArr));
		
		Arrays.sort(intArr);
		
		System.out.println("-----------------After Sorting---------------");
		System.out.println("Array is : "+Arrays.toString(intArr));

		int intKey = 22;

		// Print the key and corresponding index
		// Array must be sorted in ascending order for the binary search
		System.out.println(intKey + " found at index = " + Arrays.binarySearch(intArr, intKey));

		System.out.println(intKey + " found at index = " + Arrays.binarySearch(intArr, 1, 3, intKey));

		
		System.out.println("First Array : " + Arrays.toString(intArr));
		
		//Get the second Array
		int intArr1[] = { 10, 15, 22 };
		System.out.println("Second Array : " + Arrays.toString(intArr1));

		// To compare both arrays
		if (Arrays.equals(intArr, intArr1))
			System.out.println("Both arrays are equal");
		else
			System.out.println("Arrays are not equal");

		//creates a new array with a specified length, 
		System.out.println("\nNew Arrays by copyOf:\n");
		int intArr2[]=Arrays.copyOf(intArr, 10); //10, 20, 15, 22, 35, 18 , 14,0,0,0
		System.out.println("Integer Array: " + Arrays.toString(intArr2));

		System.out.println("\nNew Arrays by copyOfRange:");
		// To copy the array into an array of new length
		int intArr3[]=Arrays.copyOfRange(intArr, 1, 3);
		System.out.println("Integer Array: " + Arrays.toString(intArr3));

		// To fill the arrays with key 22
		Arrays.fill(intArr, intKey);
	
		System.out.println("Integer Array on filling 22: " + Arrays.toString(intArr));

	}

}
