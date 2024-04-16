package com.oop.demo;

public class Phone {
	String make;
	String model;
	String networkType;
	String os;
	int ramCapacity;
	float screenSize;
	
	// CONSTRUCTOR
	// HELPS BUILD DEFAULT BEHAVIOR OF AN OBJECT
	// AUTOMATICALLY INVOKES
	// ALSO USED AS SETTER AT TIMES
	public Phone(String mk, String mdl, String nt, String os, int ramCapacity, float screenSize) {
		System.out.println("Constrcutor Created and Assigning values");
		this.make = mk;
		this.model = mdl;
		this.networkType = nt;
		this.os = os;
		this.ramCapacity = ramCapacity;
		this.screenSize = screenSize;
	}
	
	public void switchPhoneOn() {
		if(this.os.equalsIgnoreCase("ANDROID")) {
			System.out.println("WELCOME TO ANDROID");
		}else if(this.os.equalsIgnoreCase("IOS")) {
			System.out.println("POWERING ON IOS DEVICE");
		}
	}
	
	public void switchPhoneOff() {
		System.out.println("Switching off "+model);
	}
	
	public static void main(String[] args) {
		Phone samsungPhone = new Phone("Samsung", "Galaxy s22", "5G", "Android", 16, 6.5f);
//		samsungPhone.make = "Samsung";
//		samsungPhone.model = "Galaxy s22";
//		samsungPhone.networkType = "5G";
//		samsungPhone.os = "Android";
//		samsungPhone.ramCapacity = 16;
//		samsungPhone.screenSize = 6.5f;
		samsungPhone.switchPhoneOn();
	}
}
