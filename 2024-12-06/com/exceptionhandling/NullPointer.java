package com.exceptionhandling;

public class NullPointer {
	
	@SuppressWarnings({"null"})
	public static void main(String[] args) {
		int arr [] = null;
		
		try {
			for(int i = 0; i<7; i++) {
				System.out.println(arr[i]);
			}
			
		} catch (NullPointerException e) {
			System.out.println("Invalid Value !!!");
			e.printStackTrace(); //to display the details of the exception
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
