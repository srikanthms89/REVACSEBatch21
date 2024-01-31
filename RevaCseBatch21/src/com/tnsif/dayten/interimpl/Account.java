package com.tnsif.dayten.interimpl;

public class Account {
	 private int accNo;
	 private String name;
	 private double balance;
	 private Bank bank;

	 public Account(int accNo, String name, double balance, Bank bank) {
	     this.accNo = accNo;
	     this.name = name;
	     this.balance = balance;
	     this.bank = bank;
	 }

	 public int getAccNo() {
	     return accNo;
	 }

	 public String getName() {
	     return name;
	 }

	 public double getBalance() {
	     return balance;
	 }

	 public Bank getBank() {
	     return bank;
	 }

	 public void deposit(double amount) {
	     bank.deposit(this, amount);
	 }

	 public void withdraw(double amount) {
	     bank.withdraw(this, amount);
	 }

	 
	 public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	@Override
	 public String toString() {
	     return "Account [accNo=" + accNo + ", name=" + name + ", balance=" + balance + "]";
	 }


	}

