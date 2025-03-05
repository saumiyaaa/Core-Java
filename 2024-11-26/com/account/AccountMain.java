package com.account;

// Main class to test the Account class
public class AccountMain {

    public static void main(String[] args) {

        
    	//an object of the Account class is being created and is referenced by the variable ac
    	//Account: This is the name of the class that we are creating an object of.
    	//ac: This is a reference variable of type Account that will hold the reference to the object created.
    	//new: new keyword is used to allocate memory for the object at runtime	in the heap memory area. 
    	//     This is where all objects in Java are stored.
    	//Account(): is the constructor of the Account class, which may initialize the object's fields.
        Account ac = new Account(); // Create an instance or object of the Account class

        // Initialize account details using default values
        ac.initAccount();
        ac.printDetails(); // Print the default account details

        // Get and set the owner name
        ac.getOwnerName();              // Fetches current owner name
        ac.setOwnerName("SAM");         // Updates the owner name to "SAM"

        // Get and set the account number
        ac.getAccNo();                  // Fetches current account number
        ac.setAccNo(456732);            // Updates the account number

        // Get and set the account balance
        ac.getBalance();                // Fetches current balance
        ac.setBalance(5000000);         // Updates the balance to 5,000,000

        // Print updated account details
        ac.printDetails();
    }
}
