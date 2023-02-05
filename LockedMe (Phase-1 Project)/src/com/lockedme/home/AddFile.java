package com.lockedme.home;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class AddFile {
	public void addFile(String filename, String content) {
        try {
            //Whatever the file path is.
            File newText = new File("F:\\Simplilearn\\Java Full Stack Development\\JavaFSD\\LockedMe (Phase-1 Project)\\Documents", filename);
            if (newText.createNewFile()) {
            	FileOutputStream is = new FileOutputStream(newText);
                OutputStreamWriter osw = new OutputStreamWriter(is);    
                Writer w = new BufferedWriter(osw);
                w.write(content);
                w.close();
                System.out.println("File Created: " + newText.getName());
              } else {
                System.out.println("File Already Exists. Please Choose a Different File Name.");
              }
        } catch (IOException e) {
            System.err.println("Something Went Wrong !!! Please Try Again");
        }
    }
}
