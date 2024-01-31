package com.tnsif.dayten.interimpl;
public class BankApplication {
	 public static void main(String[] args) {
	     // Create a Bank instance
	     Bank bank = new BankImpl();

	     // Create an Account
	     Account account = new Account(123456, "Mihir", 155000, bank);

	     // Deposit money
	     account.deposit(20000);
	     // Print the account details
	     System.out.println(account);
	     
	     //withdraw money
	     account.withdraw(10);
	     // Print the account details
	     System.out.println(account);
	 }
	}