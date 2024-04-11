package com.corejava.demo;

public class SuperMartDemo {
	public static void main(String[] args) {
		// customer > INR20000 - 5%
		// customer > INR30000 - 7%
		// customer > INR40000 - 10%
		int[] billAmounts = {1000, 4000, 15000, 8000, 4000, 10000};
		int totalTransactionAmount = 0;
		for(int i=0; i<billAmounts.length; i+=1) {
			totalTransactionAmount += billAmounts[i];
		}
		double netBill = 0;
		if(totalTransactionAmount > 20000 && totalTransactionAmount <= 30000) {
			netBill = totalTransactionAmount - (0.055 * totalTransactionAmount);
		}else if(totalTransactionAmount >30000 && totalTransactionAmount <= 40000) {
			netBill = totalTransactionAmount - (0.075 * totalTransactionAmount);
		}else if(totalTransactionAmount >40000) {
			netBill = totalTransactionAmount - (0.15 * totalTransactionAmount);
		}else {
			netBill = totalTransactionAmount;
		}
		System.out.println("Your total bill is "+netBill);
	}
}
