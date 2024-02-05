package com.tnsif.dayeleven;

public class StringOperationsDemo {
	public static void main(String[] args) {
		String s1 = new String("  Indian  ");
		String s2 = s1.toUpperCase();
		System.out.println(s1); 
		System.out.println(s2);
		System.out.println(s1.length());
		System.out.println(s1.substring(2, 5));
		System.out.println(s2.substring(2));
		System.out.println(s1.trim());
		System.out.println(s1.strip());
		System.out.println(s1.stripTrailing());
		System.out.println(s1.isEmpty());
	
		// String Comparison
		s1 = "Good Morning";
		s2 = new String(s1);

		System.out.println(s1 + " equals " + s2 + " -> " + s1.equals(s2));
		System.out.println(s1 + " == " + s2 + " -> " + (s1 == s2));

	}
}

