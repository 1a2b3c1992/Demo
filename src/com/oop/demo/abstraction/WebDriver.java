package com.oop.demo.abstraction;

public abstract class WebDriver {
	
	public static final String BROWSER = "chrome";
	public static final String OS = "windows";
	
	public void launchBrowser() {
		// LOGIC TO LAUNCH NEW BROWSER
		if(BROWSER.equalsIgnoreCase("chrome")) {
			// CHROME SPECIFIC LOGIC
		}else if(BROWSER.equalsIgnoreCase("firefox")) {
			// FIREFOX SPECIFIC LOGIC
		}
	}
	
	public void clickElement() {
		// LOGIC TO CLICK WEB ELEMENT
	}
	
	public void typeIntoInputBox() {
		// LOGIC TO TYPE
	}
	
	public abstract void dragAndDrop(String xCoordinate, String yCoordinate);
}
