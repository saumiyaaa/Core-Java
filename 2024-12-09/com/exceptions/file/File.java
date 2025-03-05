package com.exceptions.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class File {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the path of the file ");
		String path = sc.nextLine();
		
		FileInputStream f1 = null;
		
		try {
			//String pathnew = path.replace("\\", "/");
			
			/*
			 * the backslash (\) is a special escape character in Java strings
			 * 
			 * When you use the backslash \, Java interprets it as an escape character. For example:

				\n represents a newline.
				\t represents a tab.
				\" represents a double quote.
				
				Thus, when you write "\\" in a string, the first backslash escapes the second one, 
			*allowing you to represent a single literal backslash (\) in the string.
			 */
			
			 f1 = new FileInputStream(path);
			 
			 System.out.println("The file in the path " + path + " exists!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			System.out.println("This is Finally Block ");
			
			if (f1 != null) 
				try{
					
				f1.close();
			} catch (IOException e2) {
				
				e2.printStackTrace();
			}
		}
		
		sc.close();
	}

}
