package com.corejava.collections.list;

public class Student extends Person{
	private String email;
	private String phone;
	private boolean isEnrolled;
	
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
	public boolean isEnrolled() {
		return isEnrolled;
	}
	public void setEnrolled(boolean isEnrolled) {
		this.isEnrolled = isEnrolled;
	}
	
	@Override
	public String toString() {
		return "Student [email=" + email + ", phone=" + phone + ", isEnrolled=" + isEnrolled + ", getEmail()="
				+ getEmail() + ", getPhone()=" + getPhone() + ", isEnrolled()=" + isEnrolled() + "]";
	}
	
	
	
}
