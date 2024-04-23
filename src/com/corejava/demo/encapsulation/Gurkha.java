package com.corejava.demo.encapsulation;

// GURKHA IS A VEHICLE
// GURKHA HAS A CHASSIS, HAS AN ENGINE
public class Gurkha {
	
	private Chassis chassis;
	private Engine engine;
	
	public Chassis getChassis() {
		return chassis;
	}
	public void setChassis(Chassis chassis) {
		this.chassis = chassis;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	
}
