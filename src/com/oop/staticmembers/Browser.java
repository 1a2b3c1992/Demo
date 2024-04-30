package com.oop.staticmembers;

public class Browser {
	
	private String browserName;
	private String browserVendor;
	private String browserVersion;
	private Tab[] tabs; // OBJECT LEVEL VARIABLES
	static String session; // CLASS LEVEL VARIABLE
	
	public String getBrowserName() {
		return browserName;
	}
	public void setBrowserName(String browserName) {
		this.browserName = browserName;
	}
	public String getBrowserVendor() {
		return browserVendor;
	}
	public void setBrowserVendor(String browserVendor) {
		this.browserVendor = browserVendor;
	}
	public String getBrowserVersion() {
		return browserVersion;
	}
	public void setBrowserVersion(String browserVersion) {
		this.browserVersion = browserVersion;
	}
	
	public Tab[] getTabs() {
		return tabs;
	}
	public void setTabs(Tab[] tabs) {
		this.tabs = tabs;
	}
	
}
