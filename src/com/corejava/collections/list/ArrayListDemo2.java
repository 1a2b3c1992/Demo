package com.corejava.collections.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class ArrayListDemo2 {
	
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>();

		Student s = new Student();
//		s.se "sid";
//		s.lastName = "mishra";
//		s.email = "sid@test.com";
//		s.phone = "0219320213";
//		s.isEnrolled = true;
//		
//		Student s2 = new Student();
//		s2.firstName = "yogesh";
//		s2.lastName = "";
//		s2.email = "yogesh@test.com";
//		s2.phone = "3213321323";
//		s2.isEnrolled = true;
		
		studentList.add(s);
//		studentList.add();
		System.out.println(studentList);
	}
}
