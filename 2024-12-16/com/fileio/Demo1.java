package com.fileio;

import java.io.File;
import java.io.IOException;

public class Demo1 {
	
	public static void main(String[] args) throws IOException{
		
		File f1 = new File("D:/JAVA.txt");
		
		if(!f1.exists()) {
			f1.createNewFile();
			System.out.println("File Created...");
		}
		else {
			System.out.println("File already exists!!!");
			System.out.println("Length: "+f1.length());
		}
	}

}
