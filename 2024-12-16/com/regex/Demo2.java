package com.regex;

import java.util.regex.Matcher; // Import Matcher class for pattern matching
import java.util.regex.Pattern; // Import Pattern class for defining regular expressions

public class Demo2 {

    public static void main(String[] args) {
        // The input string where the pattern will be searched
        String input = "foo foo fooooo finfoo Foo";

        // Compile a regex pattern to search for "foo foo"
        Pattern p = Pattern.compile("foo foo");

        // Create a Matcher object to match the compiled pattern in the input string
        Matcher m = p.matcher(input);

        // Display the input string
        System.out.println("Current Input: " + input);

        // Check if the beginning of the input string matches the pattern
        // `lookingAt` checks only the prefix of the string, not the entire string
        System.out.println("lookingAt(): " + m.lookingAt()); //true

        // Check if the entire input string matches the pattern
        // `matches` checks the complete input string for a match with the pattern
        System.out.println("matches(): " + m.matches()); //false
    }
}
