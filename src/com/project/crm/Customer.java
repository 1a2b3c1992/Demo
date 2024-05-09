package com.project.crm;

import java.util.List;

public class Customer {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private Business business;
	private List<Address> addressses;
	
	public Customer() {
		
	}
	
	public Customer(int id, String firstName, String lastName, String email, String phone, Business business,
			List<Address> addressses) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.business = business;
		this.addressses = addressses;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Business getBusiness() {
		return business;
	}

	public void setBusiness(Business business) {
		this.business = business;
	}

	public List<Address> getAddressses() {
		return addressses;
	}

	public void setAddressses(List<Address> addressses) {
		this.addressses = addressses;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", phone=" + phone + ", business=" + business + ", addressses=" + addressses + "]";
	}
	
}
