package com.exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

// 1 TRY BLOCK AND MULTIPLE CATCH BLOCK

public class MultipleExceptions {
    @SuppressWarnings({ "unused", "resource"})
	public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40};

        try {
        	
        	/* // Demonstrating ArrayIndexOutOfBoundsException
            for (int i = 0; i < 7; i++) {
                System.out.println(arr[i]);
            }
        	 * 
        	 */        	
        	
            // Demonstrating normal array access
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }  

            /* Triggering NullPointerException
            
                MultipleExceptions e1 = null;
                System.out.println(e1.toString()); // Accessing a method on a null object 
                
              */
            //Demonstrating normal object creation
            MultipleExceptions e1 = new MultipleExceptions();
            System.out.println(e1.toString()); // Accessing a method on a null object 

            // Try-With-Resources for FileInputStream
            FileInputStream fi = new FileInputStream("D:\\JAVA11.txt");
                System.out.println("Reading a File ...");
            } 
        
        
        	  catch (FileNotFoundException e) {
                System.out.println("File not found!");
                e.printStackTrace();
			}  catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid Index !!!");
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
