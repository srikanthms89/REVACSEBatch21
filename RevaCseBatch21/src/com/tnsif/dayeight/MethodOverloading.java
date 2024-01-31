package com.tnsif.dayeight;

public class MethodOverloading {

	public static int addition(int a, int b) {
		return a + b;
	}

	public static float addition(float a, float b) {
		return a + b;
	}

	public static float addition(int a, float b) {
		return a + b;
	}

	public static float addition(float a, int b) {
		return a + b;
	}

	public static String addition(String a, String b) {
		return a + b;
	}

}
