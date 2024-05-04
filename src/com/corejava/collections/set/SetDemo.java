package com.corejava.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
	
	public static void main(String[] args) {
		Set<String> mySet = new HashSet<>();
		mySet.add("sid");
		mySet.add("sid");
		mySet.add("mishra");
		mySet.add("mishra");
		mySet.add("yogesh");
		mySet.add("supriya");
		System.err.println(mySet);
		
		Person p1 = new Person("Sid", "Mishra");
		Person p2 = new Person("Sid", "Mishra");
		Person p3 = new Person("Yogesh", "Kulkarni");
		Person p4 = new Person("Sid", "Mishra");
		Person p5 = new Person("Sid", "Mishra");
		
		Set<Person> personSet = new HashSet<>();
		personSet.add(p1);
		personSet.add(p2);
		personSet.add(p3);
		personSet.add(p4);
		personSet.add(p5);
		
		System.out.println(personSet);
		
		for(String tempStr : mySet) {
			System.out.println(tempStr);
		}
	}
}
