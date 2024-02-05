package com.tnsif.daytwelve;
public class MLArray
{
	static void printArray(int c[][])
	{
		System.out.println("Array Elements are as follows: ");
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++)
				System.out.print(c[i][j] + " ");
			System.out.println();
		}
	}
}