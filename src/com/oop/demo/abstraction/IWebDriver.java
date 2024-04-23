package com.oop.demo.abstraction;

/**
 * Library to interact and control browsers
 */
public interface IWebDriver {
	/**
	 * 
	 * @param browserType
	 */
	void launchBrowser(String browserType);
	/**
	 * 
	 * @param url
	 */
	void navigateToUrl(String url);
	/**
	 * 
	 * @param xpath
	 */
	void clickElement(String xpath);
	/**
	 * 
	 * @param xCoordinate
	 * @param yCoordinate
	 */
	void dragAndDrop(String xCoordinate, String yCoordinate);
}
