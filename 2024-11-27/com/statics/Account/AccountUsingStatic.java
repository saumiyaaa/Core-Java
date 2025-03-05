package com.statics.Account;

// Class representing an Account with static interest rate
public class AccountUsingStatic {

    // Instance variables (specific to each object)
    private int accno;        // Account Number
    private String name;      // Account Holder Name
    private double bal;       // Account Balance
    
    // Static variable (shared across all objects, belongs to class)
    private static float intRate;  // Interest Rate

    // Static block to initialize the static variable
    static {
        intRate = 6.5f;  // Set the default interest rate
        // Static blocks are executed only once, when the class is loaded into memory
    }

    // Default constructor
    AccountUsingStatic() {
        // Initialize with default values
        accno = 12345;
        name = "Sam";
        bal = 15000;  // Default balance
    }

    // Parameterized constructor
    AccountUsingStatic(int No, String s, double b) {
        accno = No;  // Assign account number
        name = s;    // Assign name
        bal = b;     // Assign balance
    }

    /* Static method belongs to the class itself.
     * The static method can run without any object by calling it with the class name.
     * 'this' reference is never passed to a static method.
     * Non-static data members (instance variables) require an object to access them.
     * Hence, we can't access instance variables in a static method directly.
     */
    public static float getIntRate() {
        return intRate;  // Return the static interest rate
    }

    /* Non-static methods rely on an instance of the class to exist.
     * It is mandatory to create an object for invoking a non-static method.
     * Non-static methods can access both static and non-static variables.
     */
    public void show() {
        // Display account details and the shared interest rate
        System.out.println("Account No: " + accno);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + bal);
        System.out.println("Interest Rate: " + intRate + "%");  // Accessing static variable
    }
}
