package com.corejava.demo.encapsulation;

public class Engine {
	
	private String make;
	private String model;
	private int numCylinders;
	private float engineCapacity;
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getNumCylinders() {
		return numCylinders;
	}
	public void setNumCylinders(int numCylinders) {
		this.numCylinders = numCylinders;
	}
	public float getEngineCapacity() {
		return engineCapacity;
	}
	public void setEngineCapacity(float engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
	
	
}
