package com.exceptionhandling;

public class ArrayIndexOutofBounds {
	
	public static void main(String[] args) {
		int arr [] = {10, 20, 30, 40};
		
		try {
			for(int i = 0; i<7; i++) {
				System.out.println(arr[i]);
			}
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Index !!!");
			e.printStackTrace(); //to display the details of the exception
		}
		
		int a = 10, b = 20;
		
		System.out.println("Sum: "+(a+b));
		
		if (a>b) {
			
			System.out.println("Maximum Number is "+a);
			
		}
		else {
			System.out.println("Maximum Number is "+b);
		}
		
	}

}
