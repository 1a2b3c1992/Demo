package com.corejava.demo;

public class ConditionalStatementsDemo {
	
	public static void main(String[] args) {
		// if, else, else if
		// if(<CONDITION>){
		// ....
		// ....
		// }
		// <CONDITION> = true
		String name = "Siddharth";
		if(name.contains("yogesh")) {
			System.out.println("I'll execute");
		}else {
			System.out.println("I am in else block");
		}
		System.out.println("out of if / else block");
	}
}
