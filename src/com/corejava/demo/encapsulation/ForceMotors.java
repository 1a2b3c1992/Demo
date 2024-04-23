package com.corejava.demo.encapsulation;

public class ForceMotors {
	public static void main(String[] args) {
		Engine gurkhaEngine = new Engine();
		gurkhaEngine.setMake("Force Motors");
		gurkhaEngine.setModel("Varicor 1");
		gurkhaEngine.setEngineCapacity(1200f);
		gurkhaEngine.setNumCylinders(4);
		
		Chassis gurkhaChassis = new Chassis();
		gurkhaChassis.setChassisNumber("FGUR12345");
		gurkhaChassis.setChassisType("Monocoque");
		
		// COMPOSITION
		Gurkha forceGurkha1 = new Gurkha();
		forceGurkha1.setChassis(gurkhaChassis);
		forceGurkha1.setEngine(gurkhaEngine);
	}
}
