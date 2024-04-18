package com.oop.demo.inheritance;


// IS-A
public class Car extends Vehicle{
	
	String bodyType;
	String category;
	int numGears;
	
	public Car(String make,
			String model,
			int seatCapacity,
			String type,
			float engineCapacity,
			String bodyType) {
		super(make, model, seatCapacity, type, engineCapacity);
	}
	// CONSTRUCTOR OVERLOADING
	public Car(String make,
			String model,
			int seatCapacity,
			String type,
			float engineCapacity,
			String bodyType,
			String category,
			int numGears) {
		super(make, model, seatCapacity, type, engineCapacity);
	}
	
	public int moveVehicle(int speed) {
		if(speed <= 40) {
			return 1;
		}else if(speed >40 && speed <=100) {
			return 2;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		Car santro = new Car("hyundai",
				"santro xing", 4, 
				"hatchback",1100f,
				"monocoque", "hatchback", 4);
		System.out.println(santro.startVehicle());
		System.out.println(santro.moveVehicle(90));
		System.out.println(santro.stopVehicle());
		
		// CLASS CAST EXCEPTION - THIS IS NOT PERMITTED IN JDK
		Car i20 = (Car) new Vehicle("Hyundai", "i20", 4, "hatchback", 1000f);
		i20.startVehicle();
	}
}
