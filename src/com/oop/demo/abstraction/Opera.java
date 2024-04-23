package com.oop.demo.abstraction;

public class Opera implements IWebDriver{

	@Override
	public void launchBrowser(String browserType) {
		System.out.println("Launching Opera....");
		
	}

	@Override
	public void navigateToUrl(String url) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clickElement(String xpath) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dragAndDrop(String xCoordinate, String yCoordinate) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		IWebDriver operaDriver = new Opera();
		operaDriver.launchBrowser("");
		
		IWebDriver safariDriver = new Safari();
		safariDriver.launchBrowser("");
	}

}
