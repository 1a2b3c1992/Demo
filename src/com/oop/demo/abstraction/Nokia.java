package com.oop.demo.abstraction;

public class Nokia implements GSM{

	@Override
	public void chooseNetworkFrequency(String freq) {
		// TODO Auto-generated method stub
		// NOKIA SPECIFIC CODE FOR FREQUENCY CHOOSING
	}

	@Override
	public void transmittPacketData() {
		// TODO Auto-generated method stub
		// NOKIA SPECIFIC CODE FOR TRANSMITTING DATA
	}

	@Override
	public void decodeReceivedData() {
		// TODO Auto-generated method stub
		// NOKIA SPECIFIC CODE FOR RECEIVING DATA
	}

}
