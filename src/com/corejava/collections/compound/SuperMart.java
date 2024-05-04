package com.corejava.collections.compound;

import java.util.HashMap;
import java.util.Map;

public class SuperMart {
	public static void main(String[] args) {
		Map<Integer, String> customerMap = new HashMap<>();
		customerMap.put(1, "sid1,mishra1,sid1@test.com,2183021,2145");
		customerMap.put(2, "sid1,mishra1,sid1@test.com,2183021,2145");
		/**
		 * id	firstname	lastname	email	phone	totalbill
			1	sid1	mishra1	sid1@test.com	21830218	2145
			2	sid2	mishra2	sid2@test.com	48734832	4343
			3	sid3	mishra3	sid1@test.com	75639446	4543
			4	sid4	mishra4	sid2@test.com	102544060	566
			5	sid5	mishra5	sid1@test.com	129448674	675
			6	sid6	mishra6	sid2@test.com	156353288	3242
		 */
	}
}
