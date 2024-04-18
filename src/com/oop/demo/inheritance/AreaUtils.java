package com.oop.demo.inheritance;

public class AreaUtils {
	
	int length;
	int width;
	
	public AreaUtils(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	public double calculateTriangleArea() {
		return 0.5*this.length*this.width;
	}
	// OVERLOADING
	public double calculateTriangleArea(int width) {
		return 0.5*this.length*width;
	}
	
	public double calculateAreaOfRectangle() {
		return this.length*this.width;
	}
	
}
