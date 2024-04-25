package com.corejava.demo.encapsulation;

public class Customer {
	
	private String firstName;
	private String lastName;
	private String customerId;
	private String email;
	private String phone;
	private Address address;
	
	public Customer() {
		
	}
	
	public Customer(String firstName, String lastName, String customerId, String email, String phone, Address address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.customerId = customerId;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
}
