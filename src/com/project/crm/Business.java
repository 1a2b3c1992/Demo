package com.project.crm;

import java.util.List;

public class Business {
	private int id;
	private String businessName;
	private List<Customer> customers;
	
	public Business() {
		
	}
	
	public Business(int id, String businessName, List<Customer> customers) {
		super();
		this.id = id;
		this.businessName = businessName;
		this.customers = customers;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	@Override
	public String toString() {
		return "Business [id=" + id + ", businessName=" + businessName + ", customers=" + customers + "]";
	}
	
	
}
