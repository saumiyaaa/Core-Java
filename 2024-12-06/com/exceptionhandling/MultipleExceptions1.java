package com.exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

// NESTED TRY BLOCK

public class MultipleExceptions1 {
	
	 @SuppressWarnings({ "unused", "resource", "null"})
		public static void main(String[] args) {
	        int arr[] = {10, 20, 30, 40};

	        try {
	        	
	        	 // Try-With-Resources for FileInputStream
	            FileInputStream fi = new FileInputStream("D:\\JAVA.txt");
	                System.out.println("Reading a File ...");

        	
	            // Demonstrating normal array access
	           
	            try{
	            	for (int i = 0; i < 6; i++) {
	            
	                System.out.println(arr[i]);
	                }
	            }  catch (ArrayIndexOutOfBoundsException e) {
	                System.out.println("Invalid Index !!!");
	                e.printStackTrace(); 
	            }

	            //Triggering NullPointerException
	            
	                MultipleExceptions e1 = null;
	                System.out.println(e1.toString()); // Accessing a method on a null object 
	                
	              
	            /*//Demonstrating normal object creation
	            MultipleExceptions e1 = new MultipleExceptions();
	            System.out.println(e1.toString()); // Accessing a method on a null object 
	            
	            */

	           	 }     
	        
	        	  catch (FileNotFoundException e) {
	                System.out.println("File not found!");
	                e.printStackTrace();
				} catch (NullPointerException e) {
	                System.out.println("Null Pointer Exception Occurred !!!");
	                e.printStackTrace();
	            }

	         

	        // Additional logic to check if try-catch is implementing properly
	        int a = 10;
	        int b = 20;

	        System.out.println("Sum: " + (a + b));

	        if (a > b) {
	            System.out.println("Maximum Number is " + a);
	        } else {
	            System.out.println("Maximum Number is " + b);
	        }
	    }

}
