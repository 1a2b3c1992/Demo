package com.corejava.collections.compound;

import java.util.Scanner;

public class SuperMart {
	public static void main(String[] args) {
//		Map<Integer, String> customerMap = new HashMap<>();
//		customerMap.put(1, "sid1,mishra1,sid1@test.com,2183021,2145");
//		customerMap.put(2, "sid1,mishra1,sid1@test.com,2183021,2145");
		/**
		 * id	firstname	lastname	email	phone	totalbill
			1	sid1	mishra1	sid1@test.com	21830218	2145
			2	sid2	mishra2	sid2@test.com	48734832	4343
			3	sid3	mishra3	sid1@test.com	75639446	4543
			4	sid4	mishra4	sid2@test.com	102544060	566
			5	sid5	mishra5	sid1@test.com	129448674	675
			6	sid6	mishra6	sid2@test.com	156353288	3242
		 */
		
		// SOLUTION 1
//		List<Map<String, String>> customerData = new ArrayList<>();
//		Map<String, String> rowMap = new HashMap<>();
//		rowMap.put("id", "1");
//		rowMap.put("firstName", "sid");
//		rowMap.put("lastName", "mishra");
//		rowMap.put("email", "sid@test.com");
//		rowMap.put("phone", "8432840232");
//		rowMap.put("age", "33");
//		customerData.add(rowMap);
//		
//		// SOLUTION 2
//		Map<Integer, Customer> customerProfile = new HashMap<>();
//		List<Address> addresses = new ArrayList<Address>();
//		Address address1 = new Address("1","eon", "kharadi", "pune", "maharashtra", "india");
//		Address address2 = new Address("1","magarpatta", "kharadi", "pune", "maharashtra", "india");
//		addresses.add(address1);
//		addresses.add(address2);
//		Customer customer = new Customer("1", "sid", "mishra", "33", "sid@test.com", "324783249824", "fb.com/sidmishra", addresses);
//		customerProfile.put(1, customer);
//		System.out.println(customerProfile);
		
		int numCustomers;
		int numAddress;
		Scanner sc = new Scanner(System.in);
		numCustomers = sc.nextInt();
		for(int j=0; j<numCustomers; j++) {
			numAddress = sc.nextInt();
			for(int i=0;i<numAddress; i++) {
				// address loop
			}
			// customer loop
		}
		
	}
}
