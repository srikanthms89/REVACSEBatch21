package com.tnsif.daytwelve;

//Driver class
public class Driver {
	public static void main(String args[]) {
		int n = 10;
		int a[]; // declaration
		a = new int[n]; // instantiation

		// displaying the array
		ArrayOperations.printArray(a);

		// assigning values in array a
		for (int i = 0; i < a.length; i++)
			a[i] = 5 * i;

		ArrayOperations.printArray(a);

		int b[] = { 10, 20, 30, 40, 50 }; // initialization at the time of declaration
		ArrayOperations.printArray(b);

		// calling variable argument function
		System.out.println("sum of array elements is : " + ArrayOperations.getSum(b));
		System.out.println("sum of array elements is : " + ArrayOperations.getSum(10, 20));

		b[2] = 999; // assigning single element
		// RTE - ArrayIndexOutOfBoundsException
		// b[20]=10;
		ArrayOperations.printArray(b);

		// Display total no. of Odd and Even Numbers in array b

		System.out.println("Odd numbers : " + ArrayOperations.getOddCount(b) + "\tEven numbers : "
				+ ArrayOperations.getEvenCount(b));
		System.out.println();
		System.out.println("---------------------------------------");

		int c[];
		// ArrayOperations.printArray(c); //CTE

	}

}
