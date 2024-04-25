package com.corejava.demo.encapsulation;

public class Address {
	
	private String flatNo;
	private String building;
	private String locality;
	private String city;
	private String pinCode;
	private String state;
	private String country;
	
	public Address() {
		
	}
	
	public Address(String flatNo, String building, String locality, String city, String pinCode, String state,
			String country) {
		super();
		this.flatNo = flatNo;
		this.building = building;
		this.locality = locality;
		this.city = city;
		this.pinCode = pinCode;
		this.state = state;
		this.country = country;
	}
	
	public String getFlatNo() {
		return flatNo;
	}
	public void setFlatNo(String flatNo) {
		this.flatNo = flatNo;
	}
	public String getBuilding() {
		return building;
	}
	public void setBuilding(String building) {
		this.building = building;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
}
