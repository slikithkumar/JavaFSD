package com.lockedme.home;

import java.io.File;

public class FileNameAscOrder {
	public void printFileNames(File[] files, int i)  
	{  
		// base case of the recursion  
		// i == a.length means the directory has   
		// no more files. Hence, the recursion has to stop  
		if(i == files.length)  
		{  
			return;  
		}  
		// checking if the encountered object is a file or not  
		if(files[i].isFile())  
		{  
			System.out.println(files[i].getName());  
		}
		else if(files[i].isDirectory()) {
			System.out.println(files[i].getName()+" (Sub-Directory)");
		}
		// recursively printing files from the directory  
		// i + 1 means look for the next file  
		printFileNames(files, i + 1);  
	} 
}
