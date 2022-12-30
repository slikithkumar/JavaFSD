package com.lockedme.home;

public class WelcomeScreen {
	
	String developerName;
	String developerExp;
	final String appName = "LockedMe";
	
	// Take Developer Name and Experience as an input and display using a method.
	String display(String dname, String dexp) {
		return "Welcome to "+this.appName+ ", " +dname+ " !!! You have " +dexp+ " years of experience."; 
	}
	
	void displayMenu() {
		System.out.println("Please Choose From the Following Options:");
		System.out.println("1. Display File Names in Ascending Order");
		System.out.println("2. Add Files To The Existing Directory");
		System.out.println("3. Delete A File");
		System.out.println("4. Search For A File");
		System.out.println("5. Return To Main Menu");
	}

}
