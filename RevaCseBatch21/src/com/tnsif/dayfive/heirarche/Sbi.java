package com.tnsif.dayfive.heirarche;

public class Sbi extends Rbi {
	
	private String branchname;

	public Sbi(String countryName, String bankid,String branchname) {
		super(countryName, bankid);
		this.branchname=branchname;
		// TODO Auto-generated constructor stub
	}

	public String getBranchname() {
		return branchname;
	}

	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}

	@Override
	public String toString() {
		return "Sbi [branchname=" + branchname + ", toString()=" + super.toString() + "]";
	}

	
}
