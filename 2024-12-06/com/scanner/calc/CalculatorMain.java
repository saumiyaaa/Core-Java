package com.scanner.calc;

import java.util.Scanner;

public class CalculatorMain {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Calculator c;
		
		System.out.println("----------Enter 2 numbers----------");
		System.out.println("\nEnter number 1: ");
		double n1 = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("\nEnter number 2: ");
		double n2 = sc.nextDouble();
		
		sc.nextLine();
		
		c = new Calculator(n1, n2);
		
		System.out.println("\nWhich operation do you want to perform ?");		
		System.out.println("\n1. Addition ");
		System.out.println("\n2. Subtraction ");
		System.out.println("\n3. Multiplication ");
		System.out.println("\n3. Division ");
		System.out.println("\nEnter your choice: ");
		int m = sc.nextInt();
		sc.nextLine();
		
		System.out.println(c);		
		
		switch (m) {
		case 1: {
			 System.out.println("\nResult of Addition: "+c.add(n1, n2)); 			
			
			break;
		}
		case 2: {
			 System.out.println("\nResult of Subtraction: "+c.subtraction(n1, n2));			
			
			break;
		}
		case 3: {
			 System.out.println("\nResult of Multiplication: "+c.multiply(n1, n2)); 		
			
			break;
		}
		case 4: {
			 System.out.println("\nResult of Division: "+c.divide(n1, n2));			
			
			break;
		}
		default:
			System.out.println("Unexpected value: " + m);
		}
		
		sc.close();
	}

}
