package com.corejava.collections.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		// Cookies, cache data, PWA
		// Map - Key Value
		Map<Integer, String> myMap = new HashMap<>();
		myMap.put(1, "www.qa.flipkart.com");
		myMap.put(2, "db.mysql.flipart.com");
		myMap.put(3, "www.dev.flipkart.com");
		System.out.println(myMap.get(3));
		for(int i : myMap.keySet()) {
			System.out.println(myMap.get(i));
		}
	}
}
