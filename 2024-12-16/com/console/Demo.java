package com.console;

import java.io.Console; // Import the Console class to use system console for input/output operations

public class Demo {

    public static void main(String[] args) {
        // Obtain the console object for input and output operations
        Console con = System.console();
        
        // Check if the console object is available
        if (con != null) {
            
            // Read user input using the console object
            String name = con.readLine("Please provide your name: "); // Prompt the user for their name
            char[] passdata = con.readPassword("Enter password ");    // Prompt the user for their password (hidden input)
            
            // Display a welcome message with the user's name
            System.out.println("Hello " + name + " ! Login Successful");
            
            // Convert the char array (password data) into a String
            String str = String.valueOf(passdata);
            
            // Display the password (for demonstration purposes; avoid this in real applications)
            System.out.println(str);
        } else {
            // If the console is not available (e.g., running the program in an unsupported environment)
            System.out.println("Console is Empty");
        }
    }
}
