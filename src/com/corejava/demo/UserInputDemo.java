package com.corejava.demo;

import java.util.Scanner;

public class UserInputDemo {
	public static void main(String[] args) {
		UserInputDemo demo = new UserInputDemo();
		int userOption;
		Scanner sc = new Scanner(System.in);
		System.out.println("############ WELCOME TO CALCULATOR ############");
		demo.displayMenu();
		userOption = sc.nextInt();
		int num1;
		int num2;
		switch (userOption) {
		case 1: {
			System.out.println("Enter first number : ");
			num1 = sc.nextInt();
			System.out.println("Enter second number : ");
			num2 = sc.nextInt();
			demo.calculateSum(num1, num2);
			break;
		}
		case 2: {
			System.out.println("Enter first number : ");
			num1 = sc.nextInt();
			System.out.println("Enter second number : ");
			num2 = sc.nextInt();
			System.out.println("Difference is "+(num1 - num2));
			break;
		}
		case 3: {
			System.out.println("Enter first number : ");
			num1 = sc.nextInt();
			System.out.println("Enter second number : ");
			num2 = sc.nextInt();
			System.out.println("Product is "+(num1 * num2));
			break;
		}
		case 4: {
			System.out.println("Enter first number : ");
			num1 = sc.nextInt();
			System.out.println("Enter second number : ");
			num2 = sc.nextInt();
			System.out.println("Quotient is "+(num1 / num2));
			break;
		}
		default:
			System.out.println("Invalid Input Entered! Please choose valid option from menu");
		}
	}
	
	public void displayMenu() {
		System.out.println("Enter Your Operation from below menu : ");
		System.out.println("1. Add two numbers");
		System.out.println("2. Subtract two numbers");
		System.out.println("3. Multiply two numbers");
		System.out.println("4. Divide two numbers");
	}
	
	public int calculateSum(int num1, int num2) {
		return (num1 + num2);
	}
}
