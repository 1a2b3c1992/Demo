package com.project.crm;

public class Business {
	private int id;
	private String businessName;
	
	public Business(int id, String businessName) {
		super();
		this.id = id;
		this.businessName = businessName;
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

	@Override
	public String toString() {
		return "Business [id=" + id + ", businessName=" + businessName + "]";
	}
	
}
