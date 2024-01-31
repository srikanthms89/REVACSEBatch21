package com.tnsif.dayeight;

public class OverridingDemo {

	//Dynamic Binding  //run time polymorphism // method overriding
	public static void main(String[] args) {

		RBI  rbi;
		rbi = new SBI();
		
		System.out.println(rbi.getRateOfInterst());
		rbi = new HDFC();
		System.out.println(rbi.getRateOfInterst());
		
		rbi = new ICICI();
		System.out.println(rbi.getRateOfInterst());

	}

}
