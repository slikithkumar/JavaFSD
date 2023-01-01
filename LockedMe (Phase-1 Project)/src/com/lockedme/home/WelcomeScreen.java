package com.lockedme.home;

public class WelcomeScreen {
	
	String developerName;
	String developerExp;
	final String appName = "LockedMe";
	
	// Take Developer Name and Experience as an input and display using a method.
	String display(String dname, String dexp) {
		return "Welcome To "+this.appName+ ", " +dname+ " !!! You Have " +dexp+ " Years Of Experience."; 
	}
	
	void displayMenu() {
		System.out.println("Please Choose From the Following Options:");
		System.out.println("1. Display File Names in Ascending Order");
		System.out.println("2. File Operations");
		System.out.println("3. Exit");
	}

}
