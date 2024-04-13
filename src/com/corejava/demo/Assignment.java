package com.corejava.demo;

public class Assignment {
	// AMUSEMENT PARK
	// SPLASH - 650/- , age < 5 yrs or age > 60 yrs - RIDE NOT ALLOWED
	// FERRY WHEEL - 450/- age < 3 yrs - NOT ALLOWED
	// MERRY GO ROUND - 250/- ALL ALLOWED
	// family {3, 6, 36, 42, 65}
	// SPLASH & MERRY GO ROUND
	// CALCULATE TOTAL BILL FOR ENTIRE FAMILY
	public static void main(String[] args) {
		int[] ageArray = {2, 6, 34, 38, 62, 58};
		String[] rides = {"SPLASH","MERRY GO ROUND"};
		int totalBill = 0;
		for(int i=0; i<ageArray.length; i++) {
			if(rides[0].equalsIgnoreCase("SPLASH") && (ageArray[i] < 5 || ageArray[i]>60)) {
				System.out.println("SPLASH NOT ALLOWED FOR AGE < 5 and > 60");
			}
			totalBill+=650;
			if(rides[1].equalsIgnoreCase("MERRY GO ROUND")) {
				totalBill+=250;
			}
		}
		System.out.println("TOTAL BILL FOR YOU is : "+totalBill);
	}
}
