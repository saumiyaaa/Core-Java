package com.string;

public class StringMethods {
	
	public static void main(String[] args) {
		
		String s = "Hello World";
		String s1 = "Hello World";
		String s2 = "Hello";
		
		//length() -> returs int value
		System.out.println("String length()");
		System.out.println(s.length());
		System.out.println();
		
		//public String replace(char searchChar, char newChar)
		System.out.println("String replace (Character)");
		System.out.println(s.replace('h', 'm'));
		System.out.println();
		
		//replaceAll() method replaces the first match of a regular expression in a string with a new substring.
		System.out.println("String replaceAll");
		System.out.println(s.replaceAll("World", "Pune"));
		System.out.println();
		
		/*
		 *  The regex [,\\.\\s] splits the string by
        // commas (,), spaces (\\s), and periods (\\.)
        String regex = "[,\\s\\.]";

        // using split() method
        String[] arr = s.split(regex);

        // Print each element of the resulting array
        for (String s1 : arr) {
            System.out.println(s1);
        }
		 */
		System.out.println("String split(regex)");
		String[] arr = s1.split(" ");
		 for (String x : arr) {
	            System.out.println(x);
	        }
		 System.out.println();
		 
		 System.out.println("String isEmpty()");
		 System.out.println(s.isEmpty());
		 System.out.println();
		 
		 System.out.println("String toUpperCase()");
		 System.out.println(s.toUpperCase());
		 System.out.println();
		 
		 System.out.println("String toLowerCase()");
		 System.out.println(s.toLowerCase());
		 System.out.println();
		 
		 System.out.println("String equals(s)");
		 System.out.println(s1.equals(s));
		 System.out.println();
		 
		 System.out.println("String compareTo(s)");
		 System.out.println(s1.compareTo(s));
		 System.out.println();
		 
		 System.out.println("String compareTo(s2)");
		 System.out.println(s1.compareTo(s2));
		 System.out.println();		 
		
		System.out.println("String indexOf()");
		System.out.println(s1.indexOf("H"));
		
		
 		
	}
	
	

}
