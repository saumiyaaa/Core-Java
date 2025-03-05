package com.regex;


import java.util.regex.Matcher; // Import Matcher class for pattern matching
import java.util.regex.Pattern; // Import Pattern class for defining regular expressions

public class Demo1 {

    public static void main(String[] args) {
        // Original string in which the pattern will be searched and replaced
        String str = "John Johnathan JohnFrankjohn Ken John JOHN ToddJohn";

        // Define a regex pattern to search for the word "John"
        Pattern p = Pattern.compile("John");

        // Create a Matcher object to search the pattern in the given string
        Matcher m = p.matcher(str);

        // Display the original string
        System.out.println("Original String: " + str);

        // Replace all occurrences of the word "John" with "Mike" in the string
        str = m.replaceAll("Mike");

        // Display the modified string after replacements
        System.out.println("Replaced String: " + str);
    }
}
