package com.statics.Account;

// Main class to test the AccountUsingStatic class
public class AccountUsingStaticMain {

    public static void main(String[] args) {
        // Create two AccountUsingStatic objects
        AccountUsingStatic acc1 = new AccountUsingStatic();  // Using default constructor
        AccountUsingStatic acc2 = new AccountUsingStatic(98765, "Diya", 10000);  // Using parameterized constructor

        // Display account details for acc1
        acc1.show();
        System.out.println();  // Print a blank line for readability

        // Display account details for acc2
        acc2.show();

        // Static method can be called directly using the class name
        System.out.println("\nAccessing Interest Rate directly using class name: " + AccountUsingStatic.getIntRate() + "%");
    }
}
