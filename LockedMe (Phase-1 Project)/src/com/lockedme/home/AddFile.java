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
            File newText = new File("F:\\Simplilearn\\Java Full Stack Development\\Phase-1 Project\\Documents", filename);
            if (newText.createNewFile()) {
            	FileOutputStream is = new FileOutputStream(newText);
                OutputStreamWriter osw = new OutputStreamWriter(is);    
                Writer w = new BufferedWriter(osw);
                w.write(content);
                w.close();
                System.out.println("File created: " + newText.getName());
              } else {
                System.out.println("File already exists. Please Choose a Different File Name.");
              }
        } catch (IOException e) {
            System.err.println("Something went wrong !!!");
        }
    }
}
