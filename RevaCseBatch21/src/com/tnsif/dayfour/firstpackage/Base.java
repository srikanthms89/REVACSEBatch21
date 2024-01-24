//Program to demonstrate packages and access modifiers
package com.tnsif.dayfour.firstpackage;

public class Base {
	
	//default ,public private and protected variables
	
	int varDefault = 10;
	public int varPublic = 20;
	private int varPrivate = 30;
	protected int varProtected = 40;
	
	//default ,public private and protected methods
	
	void defaultMethod()
	{
		System.out.println("Default variable " +varDefault );
		System.out.println("default method");
	}

  public void publicMethod()
	{
		System.out.println("Public variable " +varPublic );
		System.out.println("public method");
	}
	
  private void privateMethod()
	{
		System.out.println("Private variable " +varPrivate );
		System.out.println("private method");
	}
  protected void protectedMethod()
	{
		System.out.println("Protected variable " +varProtected );
		System.out.println("protected method");
	}
  
}
