package com.tnsif.dayfive.multilevel;
//Derived class
public class State extends Country {
	
	private String  stateName;
	private String language;
	
	public State() {
		super();
	}

	public State(String countryname,String countryCapital,String stateName, String language) {
		super(countryname,countryCapital);
		this.stateName = stateName;
		this.language = language;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return "State [stateName=" + stateName + ", language=" + language + ", getCountryName()=" + getCountryName()
				+ ", getCountryCapital()=" + getCountryCapital() + "]";
	}
	
	

}
