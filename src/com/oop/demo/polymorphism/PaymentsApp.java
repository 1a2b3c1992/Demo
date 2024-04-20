package com.oop.demo.polymorphism;

public class PaymentsApp extends Transaction{
	
	String platform;
	String issuerBank;
	String remitterBank;
	
	public PaymentsApp(String platform,
			String issuerBank, 
			String remitterBank,
			double debitAmount,
			double creditAmount,
			String type) {
		super.debitAmount = debitAmount;
		super.creditAmount = creditAmount;
		super.type = type;
		this.platform = platform;
		this.issuerBank = issuerBank;
		this.remitterBank = remitterBank;
	}
	
	@Override
	public void debitAmount() {
		System.out.println("Debited "+super.debitAmount+" from bank "+this.issuerBank);
	}
	
	public void debitAmount(String type) {
		if(type.equalsIgnoreCase("TRADE_SETTLEMENT")) {
			System.out.println("Amount will be settled by 12:00 CST");
		}
		System.out.println("Debited "+super.debitAmount+" from bank "+this.issuerBank);
	}
	
	public static void main(String[] args) {
		PaymentsApp phonePe = new PaymentsApp("UPI", "SBI", "ICICI", 10, 0, null);
		phonePe.debitAmount("TRADE_SETTLEMENT");
	}
}
