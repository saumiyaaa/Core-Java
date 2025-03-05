package com.exceptions.oddno;

import java.util.Scanner;

public class OddNoMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		try {	

			System.out.println("Enter a number to check: ");
			int n = sc.nextInt();
			OddNo o = new OddNo(n);
			
			o.checkOdd();

		} catch (oddNumberException e) {

			System.err.println(e.getMessage()); 
		}
		
		sc.close();
	}

}
