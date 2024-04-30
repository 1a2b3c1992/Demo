package com.corejava.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	// GENERICS
	// IRRESPECTIVE OF TYPE OF DATA - PROCESSING
	public static void main(String[] args) {
//		Integer[] myInArray = new Integer[] {1,2,3,4,5,6};
		List<Integer> myIntegerList = new ArrayList<>();
		myIntegerList.add(1);
		myIntegerList.add(2);
		myIntegerList.add(45);
		myIntegerList.add(53);
		myIntegerList.add(43);
		
		List<Integer> anotherIntList = new ArrayList<Integer>();
		anotherIntList.add(23);
		anotherIntList.add(545);
		
//		for(int str : myInArray) {
//			System.out.println(str);
//		}
		myIntegerList.addAll(anotherIntList);
		System.out.println(myIntegerList);
	}
}
