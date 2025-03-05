package com.exceptionthrows;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

// using keyword 'throws'

public class DemoThrows1 {
	
	@SuppressWarnings({ "unused", "resource" })
	public static void read() throws FileNotFoundException{
		
		FileInputStream fi = new FileInputStream("D:\\JAVA11.txt");
        System.out.println("Reading a File ...");
	}
	
	public static void main(String[] args) {
		try {
			read();
		} catch (Exception e) {
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
