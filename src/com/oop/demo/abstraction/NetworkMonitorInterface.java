package com.oop.demo.abstraction;

public interface NetworkMonitorInterface {
	
	public void measureNetworkSpeed();
	public void measureNetworkThroughput();
	public void measureNetworkBandwidth(String networkType);
}
