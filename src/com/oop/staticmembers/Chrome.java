package com.oop.staticmembers;

public class Chrome extends Browser{
	
	public static void main(String[] args) {
		Browser.session = "sadsaaddad";
		Chrome c1 = new Chrome();
		c1.setBrowserName("Google Chrome");
		Tab blankTab = new Tab();
		Tab gmailTab = new Tab();
		Tab[] openTabs = new Tab[] {blankTab, gmailTab};
		c1.setTabs(openTabs);
		// OBJECT ARRAYS ARE DIFFICULT TO MANAGE
		
		FireFox f1 = new FireFox();
		f1.setBrowserName("Mozilla FireFox");
	}
}
