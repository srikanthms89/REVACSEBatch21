package com.tnsif.dayfive.heirarche;

public class Rbi {
	
	private String countryName,bankid;

	public Rbi(String countryName, String bankid) {
		
		this.countryName = countryName;
		this.bankid = bankid;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getBankid() {
		return bankid;
	}

	public void setBankid(String bankid) {
		this.bankid = bankid;
	}

	@Override
	public String toString() {
		return "Rbi [countryName=" + countryName + ", bankid=" + bankid + "]";
	}
	
	

}
