package com.corejava.demo.encapsulation;

public class Teacher extends Person{
	
	boolean isTeacher;
	String[] subjects;
	private String password;
	
	public void setPassword(String password) {
		this.password = password;
	}
}
