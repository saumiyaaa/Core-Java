package com.strings;

import java.util.Scanner;

public class ASCIIvalues {
	
	 
	
	public static int sum(char in1, char in2) {
		
		int a = (int)in1;
		int b = (int)in2;
		
		return a+b;
		
	}
	
	public static int difference(char in1, char in2) {
		
		int a = (int)in1;
		int b = (int)in2;
		
		if (a>b) {
			return a-b;
		}else {
			return b-a;
		}	
		
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st character: ");
		char in1 = sc.next().charAt(0);
		System.out.println("Enter 2nd character: ");
		char in2 = sc.next().charAt(0);
		
		System.out.println("Sum: "+sum(in1, in2));
		System.out.println("Difference: "+difference(in1, in2));
		
		sc.close();

	}

}
