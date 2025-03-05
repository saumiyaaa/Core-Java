package com.string;

public class StringConcat {

    public static void main(String[] args) {
        
        // Declaring two String variables
        String s1, s2;
        
        // Assigning the same string "Seed" to both s1 and s2
        s1 = s2 = "Seed";
        
        // String is immutable in Java. 
        // Here, s2 is being redefined by concatenating " Infotech" to its original value.
        s2 = s2 + " Infotech";  // s2 now refers to a new string object ("Seed Infotech")
        
        // Printing the original and modified strings
        System.out.println("String 1: "+s1);  // s1 is still "Seed"
        System.out.println("String 2: "+s2);  // s2 is now "Seed Infotech"
        System.out.println("\n");
        
        System.out.println("IS THE OBJECT MEMORY OF S1 and S2 SAME OR DIFFERENT");
        
        // Comparing memory locations (references) of s1 and s2
        if(s1 == s2) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
        
        System.out.println("\n");
        
        System.out.println("IS THE VALUE OF S1 and S2 SAME OR DIFFERENT");
        
        // Comparing values of s1 and s2 (contents of the strings)
        if (s1.equals(s2)) {
            System.out.println("Same Value");
        } else {
            System.out.println("Different Value");
        }
    }

}
