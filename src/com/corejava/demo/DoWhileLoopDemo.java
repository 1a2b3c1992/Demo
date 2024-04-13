package com.corejava.demo;

public class DoWhileLoopDemo {
	public static void main(String[] args) {
		int i=101;
		do {
			System.out.println("I'll execute atleast once!");
			System.out.println("Iterating "+i);
			i++;
		}while(i <= 100);
	}
}
