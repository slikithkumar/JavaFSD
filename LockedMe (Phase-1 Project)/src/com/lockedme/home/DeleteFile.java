package com.lockedme.home;

import java.io.File;

public class DeleteFile {
	public String deleteFile(String path, String dfile) {
		File dir = new File(path);
		
		String[] flist = dir.list();
		String delFile = dfile;   
		
		for(int i=0; i < flist.length; i++) {
			if(flist[i].equals(delFile)) {
				File file = new File(path+ "\\"+ flist[i]);
				file.delete();
				return "Deleted The File: "+ file.getName();
			}
		}
		
		return "File Not Found. Please Check The File Name Entered and Try Again.";
		
		//for(int i=0; i < flist.length; i++) System.out.println(flist[i]);
	}
}
