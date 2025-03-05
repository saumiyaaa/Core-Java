package com.string.startscap;

import java.util.Scanner;

public class StartsCapital {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		String finalString = "";
		
		String s [] = str.split(" ");
		for(String x : s) {
			if(Character.isUpperCase(x.charAt(0))) {
				System.out.println(x+" is already in Upper Case !!!");				
			}
			else {
				x = x.substring(0, 1).toUpperCase() + x.substring(1);				
			}
			finalString = (finalString.concat(" ").concat(x));
	    
		}
		System.out.println("\n"+finalString);
		
      sc.close();
	}

}
