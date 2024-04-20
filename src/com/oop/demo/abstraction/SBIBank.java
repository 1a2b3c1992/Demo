package com.oop.demo.abstraction;

public class SBIBank extends Banking{

	@Override
	public void debitAmount() {
		// SBI SPECIFIC LOGIC
	}
	
	public static void main(String[] args) {
		SBIBank sbiKharadi = new SBIBank();
	}
}
