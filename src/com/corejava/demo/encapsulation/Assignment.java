package com.corejava.demo.encapsulation;

import java.util.Scanner;

public class Assignment {
	// CUSTOMER MANAGEMENT
	// CUSTOMER ENTITY
	// ADDRESS ENTITY
	// BUSINESS ENTITY
	// BUSINESS -> HAS -> CUSTOMER -> HAS -> ADDRESS
	// Menu:
	// create an address - USE SETTERS AND GETTERS
	// Create a customer
	// Create a business
	// CREATE AND UPDATE functionality
	
	public static void main(String[] args) {
		boolean isRunning = true;
		Scanner sc = new Scanner(System.in);
		int option = 0;
		while(isRunning) {
			displayMenu();
			option = sc.nextInt();
			switch(option) {
			case 1:
				createBusiness();
				break;
				
			case 2:
				createCustomer();
				break;
				
			case 3: 
				createAddress();
				break;
				
			case 4:
				// TBD
				System.out.println();
				
			case 5:
				isRunning = false;
				break;
				
			default:
				System.out.println("Enter valid option");
			}
		}
		
	}
	
	public static void displayMenu() {
		System.out.println("############### Customer Management Menu ###############");
		System.out.println("1. Create a Business");
		System.out.println("2. Create a Customer");
		System.out.println("3. Create an Address");
		System.out.println("4. view Business Details");
		System.out.println("5. Quit Program");
	}
	
	public static Business createBusiness() {
		Business business = new Business();
		Scanner sc = new Scanner(System.in);
		int numCustomers = 0;
		System.out.println("Enter Business Name :");
		business.setBusinessName(sc.nextLine());
		System.out.println("Enter Business sector");
		business.setBusinessSector(sc.nextLine());
		System.out.println("Enter Business Turnover In Crores");
		business.setBusinessTurnoverInCr(Double.parseDouble(sc.nextLine()));
		System.out.println("How Many Customers do you wish to create");
		numCustomers = sc.nextInt();
		Customer c = new Customer("Sid", "Mishra", "123213213", "sid@test.com", "84302824", null);
		Customer[] customers = new Customer[] {c};
//		String[] myStrings = new String[] {"abc", "def"};
		business.setCustomer(customers);
		return business;
	}
	
	public static Customer createCustomer() {
		Scanner sc = new Scanner(System.in);
		return null;
	}
	
	public static Address createAddress() {
		Scanner sc = new Scanner(System.in);
		return null;
	}
}
