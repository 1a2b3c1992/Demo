package com.corejava.demo;

public class ArraysDemo {
	public static void main(String[] args) {
		// bunch of homogeneous data
		int[] myNumbers = {1,2,3,4,5,6,6};
		//                 0 1 2 ......n-1
		System.out.println(myNumbers[1]);
		int[] anotherArray = new int[7];
		System.out.println(anotherArray[3]);
		
		// multidimensional arrays - 2D
		// dataType[][] variableName = // data / new datatype[size of rows][size of columns
		String[][] myStudents = {
			{"first name", "last name", "email", "phone"},
			{ "yogesh", "kulkarni", "yogesh@test.com", "39789"},
			{ "supriya", "palande", "supriya@test.com", "3973242489"}
		};
		System.out.println(myStudents[0].length);
	}
}
