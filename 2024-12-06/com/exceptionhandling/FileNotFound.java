package com.exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileNotFound {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		FileInputStream fileInputStream = null;
		
		try {
			System.out.println("Reading a File ...");
			//fileInputStream = new FileInputStream("D:\\JAVA.txt");// correct file path, so no error
			fileInputStream = new FileInputStream("D:\\JAVA11.txt"); // file does not exist		
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		int a = 10; 
		int b = 20;
		
		System.out.println("Sum: "+(a+b));
		
		if (a>b) {
			
			System.out.println("Maximum Number is "+a);
			
		}
		else {
			System.out.println("Maximum Number is "+b);
		}
	}

}
