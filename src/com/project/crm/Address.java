package com.project.crm;

public class Address {
	private int id;
	private String street;
	private String locality;
	private String city;
	private String state;
	private String country;
	private String pinCode;
	
	public Address(int id, String street, String locality, String city, String state, String country, String pinCode) {
		super();
		this.id = id;
		this.street = street;
		this.locality = locality;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pinCode = pinCode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
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

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", locality=" + locality + ", city=" + city + ", state="
				+ state + ", country=" + country + ", pinCode=" + pinCode + "]";
	}
	
}
