package com.oop.accessspecifiers;

public class SocialMediaApp {
	
	public static void registerNewUser() {
		User user1 = new User();
		user1.setPhoneNumber("21321323213");
		user1.setUserEmail("user@test.com");
		user1.setUserName("username1");
		user1.setUserPassword("password1");
		UserProfile profile = new UserProfile();
		user1.setUserProfile(profile);
	}
	
	public static void resetPassword() {
		// OTP verfication
		User user1 = new User(); // NOT ALWAYS REQUIRED - LOADS FROM DB
		user1.setUserPassword("sadsaaa");
	}
	
	public static void main(String[] args) {
		new SocialMediaApp().registerNewUser();
	}
}
