package com.string.searchword;

import java.util.Scanner;

public class SearchWordAndReplace {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		System.out.println("Enter the word to be searched");
		String find = sc.nextLine();
		
		boolean flag = false;
		String finalString = "";
		
		String s [] = str.split(" ");	
		for(String x : s) {
			if(x.compareToIgnoreCase(find) == 0) {
				System.out.println(x+" is Found !!!");
				System.out.println("\nEnter the word to be replaced with");
				String replace = sc.nextLine();
				x = x.replace(x, replace);
				finalString = (finalString.concat(" ").concat(x));
				flag = true;
			}
			else {
				finalString = (finalString.concat(" ").concat(x));
			}
			
		}	
		if (!flag) {
			
			System.out.println("Word not found");
			finalString = str;
		}      
	    
		
		System.out.println("\n"+finalString);
		
      sc.close();
	}

}
