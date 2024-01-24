package com.tnsif.dayfive.multilevel;

public class City extends State {
	
	private String cityName;
	private float area;
	
	public City() {
		super();
	}

	public City(String countryName,String countryCapital,String  stateName,String language,String cityName, float area) {
		super(countryCapital,countryName,stateName,language);
		this.cityName = cityName;
		this.area = area;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public float getArea() {
		return area;
	}

	public void setArea(float area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "City [cityName=" + cityName + ", area=" + area + ", getStateName()=" + getStateName()
				+ ", getLanguage()=" + getLanguage() + ", getCountryName()=" + getCountryName()
				+ ", getCountryCapital()=" + getCountryCapital() + "]";
	}
	
	
	

}
