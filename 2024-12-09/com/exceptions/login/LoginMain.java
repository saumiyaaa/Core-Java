package com.exceptions.login;

import java.util.Scanner;

public class LoginMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Username ");
		String uname = sc.next();
		System.out.println("\nEnter Password ");
		String pass = sc.next();
		
		Login l = new Login();
		
		try {
			l.checkCredentials(uname, pass);
		} catch (InvalidCredentialsError e) {
			System.err.println(e.getMessage());
		}
		
		sc.close();
 
	}

}
