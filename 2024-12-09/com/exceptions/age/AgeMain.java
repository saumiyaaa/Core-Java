package com.exceptions.age;

import java.util.Scanner;

public class AgeMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		sc.nextLine();
		
		Age age1 = new Age(age);
		
		try {
			
			age1.check_age();
			
		} catch (AgeIsInvalidException e) {
			System.err.println(e.getMessage());
		}
		
		sc.close();

	}

}
