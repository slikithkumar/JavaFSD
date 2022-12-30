package com.lockedme.home;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class LockedMeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int choice;
		
		WelcomeScreen ws = new WelcomeScreen();
		System.out.println("Enter Your Name: ");
		ws.developerName = sc.nextLine();
		System.out.println("Enter Your Experience: ");
		ws.developerExp = sc.next();
		sc.nextLine();
		
		
		// Root Directory For This Project
		String path = "F:\\Simplilearn\\Java Full Stack Development\\Phase-1 Project\\Documents"; 
		
		
		// Display Application Name and Developer Details.
		System.out.println(ws.display(ws.developerName, ws.developerExp));
		// Display Menu
		ws.displayMenu();
		System.out.println("Please Choose From Above Operations[1-5]: ");
		choice = sc.nextInt();
		sc.nextLine();
		
		switch(choice) {
			case 1: // Display Files and Sub-Directories in Ascending Order
				    FileNameAscOrder fao = new FileNameAscOrder();
					File fObj = new File(path);
					if(fObj.exists() && fObj.isDirectory())  
					{  
						// array for the files of the directory pointed by fObj  
						File files[] = fObj.listFiles();  
						// display statements  
						System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");  
						System.out.println("Displaying Files from the directory : " + fObj);  
						System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");
						Arrays.sort(files);
						// Calling the method  
						fao.printFileNames(files, 0);  
					}
					break;
			case 2: // Add Files To The Existing Directory
					AddFile af = new AddFile();
					System.out.println("Enter New File Name: ");
					String fname = sc.nextLine();
					sc.nextLine();
					//System.out.println(fname);
					System.out.println("Enter The Content For New File: ");
					String content = sc.nextLine();
					sc.nextLine();
					//System.out.println(content);
					af.addFile(fname, content);
					break;
			case 3: //Delete A File
					DeleteFile df = new DeleteFile();
					System.out.println("Enter The File Name To Be Deleted(Case-Sensitive): ");
					String dfile = sc.nextLine();
					sc.nextLine();
					String del_res = df.deleteFile(path, dfile);
					System.out.println(del_res);
					break;
			case 4: // Search For A File
					SearchFile sf = new SearchFile();
					System.out.println("Enter The File Name With Extension To Search: ");
					String f = sc.nextLine();
					System.out.println(sf.searchFile(path, f));
					break;
			case 5: // Return To Main Menu
					break;
			default: System.out.println("Not A Valid Option. Please Choose A Value Between 1-5.");
					 break;
		}
		
	}

}
