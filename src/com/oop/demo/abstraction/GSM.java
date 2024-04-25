package com.oop.demo.abstraction;

/**
 * GSM IS A STANDARD FOR WIRELESS CROSS DEVICE COMMUNICATION
 * ...
 * ...
 * .....
 */
public interface GSM {
	
	/**
	 * This method is responsible for registering the device into
	 * provided network carrier frequency
	 * @param freq
	 */
	public void chooseNetworkFrequency(String freq);
	
	/**
	 * This method is used to stream audio data from
	 * source to carrier
	 */
	public void transmittPacketData();
		
	/**
	 * This method s used to decode and stream audio
	 * data back into destination device.
	 */
	public void decodeReceivedData();
}
