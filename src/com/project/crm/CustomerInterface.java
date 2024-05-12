package com.project.crm;

public interface CustomerInterface {
	/**
	 * <p>This method creates a new customer and persists to database<p>
	 * @param customer
	 * @version 1.0
	 */
	public int createCustomer(Customer customer);
	
	/**
	 * <p>This method reads a new customer from database<p>
	 * @param customer
	 * @version 1.0
	 */
	public void readCustomerDetails(int id);
	
	/**
	 * <p>This method updates a information for an existing customer<p>
	 * @param customer
	 * @version 1.0
	 */
	public void updateCustomerDetails(Customer customer, int id);
	
	/**
	 * <p>This method deletes a customer<p>
	 * @param customer
	 * @version 1.0
	 */
	public void deleteCustomer(int id);
	
	/**
	 * <p>This method creates a new customer and persists to database<p>
	 * @param customer
	 * @version 1.0
	 */
	public int createBusiness(Business business);
	
	/**
	 * <p>This method reads a new customer from database<p>
	 * @param customer
	 * @version 1.0
	 */
	public void readBusinessDetails(int id);
	
	/**
	 * <p>This method updates a information for an existing customer<p>
	 * @param customer
	 * @version 1.0
	 */
	public void updateBusinessDetails(Customer customer, int id);
	
	/**
	 * <p>This method deletes a customer<p>
	 * @param customer
	 * @version 1.0
	 */
	public void deleteBusiness(int id);
	
	/**
	 * <p>This method creates a new customer and persists to database<p>
	 * @param customer
	 * @version 1.0
	 */
	public int createAddress(Address address);
	
	/**
	 * <p>This method reads a new customer from database<p>
	 * @param customer
	 * @version 1.0
	 */
	public void readAddressDetails(int id);
	
	/**
	 * <p>This method updates a information for an existing customer<p>
	 * @param customer
	 * @version 1.0
	 */
	public void updateAddressDetails(Customer customer, int id);
	
	/**
	 * <p>This method deletes a customer<p>
	 * @param customer
	 * @version 1.0
	 */
	public void deleteAddress(int id);
	
}
