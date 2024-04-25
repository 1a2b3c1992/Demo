package com.corejava.demo.encapsulation;

public class Business {
	
	private String businessName;
	private String businessSector;
	private double businessTurnoverInCr;
	
	private Customer[] customer;
	
	public Business() {
		
	}

	public Business(String businessName, String businessSector, double businessTurnoverInCr, Customer[] customer) {
		super();
		this.businessName = businessName;
		this.businessSector = businessSector;
		this.businessTurnoverInCr = businessTurnoverInCr;
		this.customer = customer;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public String getBusinessSector() {
		return businessSector;
	}

	public void setBusinessSector(String businessSector) {
		this.businessSector = businessSector;
	}

	public double getBusinessTurnoverInCr() {
		return businessTurnoverInCr;
	}

	public void setBusinessTurnoverInCr(double businessTurnoverInCr) {
		this.businessTurnoverInCr = businessTurnoverInCr;
	}

	public Customer[] getCustomer() {
		return customer;
	}

	public void setCustomer(Customer[] customer) {
		this.customer = customer;
	}
	
}
