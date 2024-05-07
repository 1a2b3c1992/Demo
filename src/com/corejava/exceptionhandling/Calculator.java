package com.corejava.exceptionhandling;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		int i;
		int j;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter first number");
			i = sc.nextInt();
			System.out.println("Enter second number");
			j=sc.nextInt();
			System.out.println("Quotient is "+(i/j));
		}catch(Exception e) {
			System.out.println("Invalid Input supplied! Please check the input again");
			e.getMessage();
		}finally {
			System.out.println("I'll Always run!");
		}
	}
}
