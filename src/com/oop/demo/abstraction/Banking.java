package com.oop.demo.abstraction;

// PARTIAL ABSTRACTION
public abstract class Banking {
	
	String user;
	String accountType;
	long accountId;
	double balance;
	
	public abstract void debitAmount();
	
	public void creditAmount() {
		System.out.println("Credited");
	}
	// INTERVIEW Q - YOU CAN DEFINE CONCRETE METHODS IN ABSTRACT CLASSES
}
