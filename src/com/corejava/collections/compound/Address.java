package com.corejava.collections.compound;

public class Address {
	private String id;
	private String street;
	private String area;
	private String city;
	private String state;
	private String country;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
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
	public Address(String id, String street, String area, String city, String state, String country) {
		super();
		this.id = id;
		this.street = street;
		this.area = area;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", area=" + area + ", city=" + city + ", state=" + state
				+ ", country=" + country + "]";
	}
	
}
