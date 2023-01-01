package com.lockedme.home;

import java.io.File;

public class SearchFile {
	
	public String searchFile(String path, String f)
    {
        // Create an object of the File class
        // Replace the file path with path of the directory
        File directory = new File(path);
  
        // store all names with same name
        // with/without extension
        String[] flist = directory.list();
 
        if (flist == null) {
            return "Empty Directory.";
        }
        else {
  
            // Linear search in the array
            for (int i = 0; i < flist.length; i++) {
                String filename = flist[i];
                if (filename.equals(f)) {
                    return filename + " Found";
                }
            }
        }
        
        return "File Not Found. Please check the file name entered and try again.";
    }
}

