package com.corejava.demo;

public class MethodsDemo {
	public int calculateStringLength(String stringInput) {
		return stringInput.length();
	}
	public static void main(String[] args) {
		// <ACCESS SPECIFIER> <RETURN TYPE> <METHOD NAME>(<ARGUMENTS>) {
		// ....
		// ....
		// ....
		// }
		MethodsDemo m1 = new MethodsDemo();
		System.out.println(m1.calculateStringLength("some other string"));
	}
}
