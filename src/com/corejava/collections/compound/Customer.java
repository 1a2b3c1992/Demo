package com.corejava.collections.compound;

import java.util.List;

public class Customer {
	private String id;
	private String firstName;
	private String lastName;
	private String age;
	private String email;
	private String phone;
	private String socialMediaHandle;
	private List<Address> adresses;
	
	public Customer(String id, String firstName, String lastName, String age, String email, String phone, String socialMediaHandle, List<Address> adresses) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.email = email;
		this.phone = phone;
		this.socialMediaHandle = socialMediaHandle;
		this.adresses = adresses;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
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
	

	public String getSocialMediaHandle() {
		return socialMediaHandle;
	}

	public void setSocialMediaHandle(String socialMediaHandle) {
		this.socialMediaHandle = socialMediaHandle;
	}

	public List<Address> getAdresses() {
		return adresses;
	}

	public void setAdresses(List<Address> adresses) {
		this.adresses = adresses;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ ", email=" + email + ", phone=" + phone + ", socialMediaHandle=" + socialMediaHandle + ", adresses="
				+ adresses + "]";
	}

}
