package com.corejava.demo.encapsulation;

public class SchoolManagement {
	
	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		// TRIGGERED DURING REGISTER
		teacher.setPassword("ABCD12244");
		// FORGOT PASSWORD
		teacher.setPassword("QWERT#$%%");
	}
}
