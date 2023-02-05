package com.lockedme.home;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class LockedMeApp {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int choice;
		boolean exit = false;
		
		System.out.println("=======================================================================================================");
		System.out.println("                                              LOCKEDME.com                                             ");
		System.out.println("=======================================================================================================");
		
		WelcomeScreen ws = new WelcomeScreen();
		System.out.println("Enter Your Name: ");
		ws.developerName = sc.nextLine();
		System.out.println("Enter Your Experience: ");
		ws.developerExp = sc.next();
		sc.nextLine();
		
		
		// Root Directory For This Project
		String path = "F:\\Simplilearn\\Java Full Stack Development\\JavaFSD\\LockedMe (Phase-1 Project)\\Documents"; 
		
		
		// Display Application Name and Developer Details.
		System.out.println(ws.display(ws.developerName, ws.developerExp));
		System.out.println();
		
		do {
			System.out.println();
			System.out.println("=====================================================================");
			System.out.println("                               MENU                                  ");
			System.out.println("=====================================================================");
			ws.displayMenu();
			System.out.println("Please Choose From Above Operations[1-3]: ");
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
				case 2: // File Operations
						boolean usr_choice = true;
						do {
							System.out.println("=====================================================================");
							System.out.println("                            FILE OPERATIONS                          ");
							System.out.println("=====================================================================");
							System.out.println("Please Choose A File Operation To Perform: ");
							System.out.println("1. Add File To The Existing Directory");
							System.out.println("2. Delete File From The Existing Directory");
							System.out.println("3. Search For A File In The Existing Directory");
							System.out.println("4. Return To Main Menu");
							int option = sc.nextInt();
							sc.nextLine();
							switch(option){
								case 1: // Add Files To The Existing Directory
										AddFile af = new AddFile();
										System.out.println("Enter New File Name: ");
										String fname = sc.nextLine();
										sc.nextLine();
										System.out.println("Enter The Content For New File: ");
										String content = sc.nextLine();
										sc.nextLine();
										af.addFile(fname, content);
										break;
								case 2: //Delete A File
										DeleteFile df = new DeleteFile();
										System.out.println("Enter The File Name To Be Deleted(Case-Sensitive): ");
										String dfile = sc.nextLine();
										sc.nextLine();
										String del_res = df.deleteFile(path, dfile);
										System.out.println(del_res);
										break;
								case 3: // Search For A File
										SearchFile sf = new SearchFile();
										System.out.println("Enter The File Name With Extension To Search(Case-Sensitive): ");
										String f = sc.nextLine();
										System.out.println(sf.searchFile(path, f));
										break;
								case 4: // Return to Main Menu
										usr_choice = false;
										System.out.println("Returning to Main Menu");
										break;
								default: System.out.println("Not A Valid Option. Please Choose A Value Between 1-4.");
							 		 	break;
							}
						}while(usr_choice == true);
						break;
				case 3: // Return To Main Context
						exit = true;
						System.out.println("======================================================================================================");
						System.out.println("                       Exiting The Application Now. We Hope To See You Soon.                          ");
						System.out.println("======================================================================================================");
						break;
				default: System.out.println("Not A Valid Option. Please Choose A Value Between 1-3.");
						 break;
			}
		} while(exit == false);
		sc.close();
		
	}

}
