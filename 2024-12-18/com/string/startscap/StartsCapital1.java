package com.string.startscap;

import java.util.Scanner;

public class StartsCapital1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.nextLine();

        // Using StringBuilder for better performance
        // Explanation:
        // 1. Strings in Java are immutable, meaning every modification (like concatenation) creates a new object.
        // 2. This results in multiple unnecessary objects being created in memory, which is inefficient, especially in loops.
        // 3. StringBuilder is mutable and modifies the same object, avoiding unnecessary object creation.
        // 4. StringBuilder is much faster for repeated string concatenation operations.

        String[] words = str.split(" "); // Split the input string into words
        StringBuilder finalString = new StringBuilder(); // Use StringBuilder for efficient concatenation

        // Process each word
        for (String word : words) {
            if (Character.isUpperCase(word.charAt(0))) {
                System.out.println(word + " is already in Upper Case!");
            } else {
                // Capitalize the first letter of the word
                word = word.substring(0, 1).toUpperCase() + word.substring(1);
            }
            // Append the word to the final string
            finalString.append(word).append(" ");
        }

        // Output the result
        // The trim() is used to remove the trailing space after the last word
        System.out.println("\n" + finalString.toString().trim());

        sc.close();
    }
}
