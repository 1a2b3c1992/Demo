package com.oop.accessspecifiers;

public class User {
	// NO ACCES SPECIFIER MEANS DEFAULT!
	// public - accessible everywhere inside the project directory
	// protected - accessible to the same class and child classes
	// private - accessible only inside the scope of defined classs
	private String userName;
	private String userEmail;
	private String userPassword;
	private String phoneNumber;
	private UserProfile userProfile;
	
	// GETTERS AND SETTERS
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserName() {
		return this.userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public UserProfile getUserProfile() {
		return userProfile;
	}

	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}
	
}
