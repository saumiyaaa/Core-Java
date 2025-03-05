package com.exceptions.factorial;

import java.util.Scanner;

public class FactorialMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number whose Factorial you want to calculate ");
		int n = sc.nextInt();
		sc.nextLine();
		
		Factorial f = new Factorial(n);
		
		try {
			f.calcFactorial();
		} catch(NegativeNumberException e) {
			System.err.println(e.getMessage());
		}
		
		sc.close();

	}

}
