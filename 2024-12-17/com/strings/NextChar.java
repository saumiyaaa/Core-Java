package com.strings;

import java.util.Scanner;


public class NextChar {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char input = sc.next().charAt(0);
        
        char nextChar = (char) (input + 1);
        
        System.out.println("Next character of "+input+" is: "+nextChar);
        
        sc.close();
	}

}
