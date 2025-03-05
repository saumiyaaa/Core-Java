package com.string.searchword;

import java.util.Scanner;

public class SearchWordAndReplace1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the string
        System.out.println("Enter a String:");
        String str = sc.nextLine();

        // Input the word to search
        System.out.println("Enter the word to be searched:");
        String find = sc.nextLine();

        // Split the string into words
        String[] words = str.split(" ");
        boolean wordFound = false;

        // Iterate through the words and replace if needed
        for (int i = 0; i < words.length; i++) {
            if (words[i].equalsIgnoreCase(find)) {
                System.out.println(words[i] + " is Found!");
                System.out.println("\nEnter the word to be replaced with:");
                String replace = sc.nextLine();
                words[i] = replace;
                wordFound = true;
            }
        }

        // Reconstruct the final string from the words array
        String finalString = String.join(" ", words);

        if (!wordFound) {
            System.out.println("Word not found.");
        }

        // Print the final string
        System.out.println("\n" + finalString);

        sc.close();
    }
}
