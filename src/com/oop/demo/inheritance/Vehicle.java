package com.oop.demo.inheritance;

// IS-A Relationship
public class Vehicle {
	
	String make;
	String model;
	int seatCapacity;
	String type;
	float engineCapacity;
	
	public Vehicle(String make, String model, int seatCapacity, String type, float engineCapacity) {
		this.make = make;
		this.model = model;
		this.seatCapacity = seatCapacity;
		this.type = type;
		this.engineCapacity = engineCapacity;
	}
	
	public String startVehicle() {
		return "Vehicle "+this.model+" Started!";
	}
	
	public String stopVehicle() {
		return "Vehicle "+this.model+" Stopped!";
	}
}
