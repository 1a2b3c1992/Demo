package com.oop.demo.abstraction;

public class Apple implements GSM{

	@Override
	public void chooseNetworkFrequency(String freq) {
		// TODO Auto-generated method stub
		// APPLE SPECIFIC CODE FOR FREQUENCY CHOOSING
	}

	@Override
	public void transmittPacketData() {
		// TODO Auto-generated method stub
		// APPLE SPECIFIC CODE FOR TRANSMITTING DATA
	}

	@Override
	public void decodeReceivedData() {
		// TODO Auto-generated method stub
		// APPLE SPECIFIC CODE FOR RECEIVING DATA
	}
	
	public static void main(String[] args) {
		GSM nokiaDevice = new Apple();
		nokiaDevice.chooseNetworkFrequency("2000");
		nokiaDevice.transmittPacketData();
		nokiaDevice.decodeReceivedData();
	}
}
