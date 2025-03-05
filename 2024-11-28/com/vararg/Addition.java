package com.vararg; // Package declaration to organize the class

// Class to demonstrate addition using varargs
public class Addition {

    // Method to perform addition using varargs
    // `int ...a` is a varargs parameter, allowing the method 
	// to accept a variable number of integer arguments.
    public void add(int... a) {
        int sum = 0; // Initialize sum to store the result

        // Enhanced for loop to iterate through each argument passed in the varargs
        for (int x : a) {
            sum += x; // Add each argument to the sum
        }

        // Print the result of the addition
        System.out.println("ADDITION: " + sum);
    }
    
    public void addition(int ... a) {
        int sum = 0; // Initialize sum to store the result

        // Enhanced for loop to iterate through each argument passed in the varargs
        for (int x : a) {
            sum += x; // Add each argument to the sum
        }

        // Print the result of the addition
        System.out.println("ADDITION: " + sum);
    }


    // Main method to test the varargs functionality
    public static void main(String[] args) {
        
        // Create an instance of the class
        Addition addition = new Addition();

        // Call the add method with 2 arguments
        addition.add(10, 20); // Output: ADDITION: 30

        // Call the add method with 5 arguments
        addition.add(10, 20, 30, 40, 50); // Output: ADDITION: 150

        // Call the add method with 3 arguments
        addition.add(70, 40, 13); // Output: ADDITION: 123

        // Call the add method with no arguments (empty varargs array)
        addition.add(); // Output: ADDITION: 0
    }
}
