package com.oop.demo.inheritance;

public class ThreeDimensionalAreaUtils extends AreaUtils{
	
	int height;

	public ThreeDimensionalAreaUtils(int length, int width, int height) {
		super(length, width);
		this.height = height;
	}
	
	public double calculateAreaOfCuboid() {
		return (2*this.length*this.width) + (2*this.width*this.height)
				+ (2*this.height*this.length);
	}
	
	// METHOD OVERRIDING
	@Override
	public double calculateTriangleArea() {
		return 0.756 * this.width * this.height;
	}
	
	// OVERLOADING
	public double calculateTriangleArea(int length,int width) {
		return 0.5*length*width;
	}
	
	public static void main(String[] args) {
		ThreeDimensionalAreaUtils utils = new ThreeDimensionalAreaUtils(4, 6, 8);
		System.out.println(utils.calculateTriangleArea());
		
		AreaUtils utils1 = new AreaUtils(3,5);
		utils1.calculateTriangleArea();
	}

}
