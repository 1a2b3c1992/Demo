package com.oop.demo.inheritance;

public class AndroidPhone extends Phone{
	
	String os;
	
	public void launchApp(String appName) {
		System.out.println("Launching App "+appName);
	}
	
	@Override
	public void switchPhoneOn() {
		System.out.println("Swithing on Android Device");
	}
	
	// OVERLOAD
	public void switchPhoneOn(String os) {
		System.out.println("Switching on "+os+" device");
	}
	
	public static void main(String[] args) {
		AndroidPhone galaxyPhone = new AndroidPhone();
		galaxyPhone.switchPhoneOn("IOS");
	}
}
