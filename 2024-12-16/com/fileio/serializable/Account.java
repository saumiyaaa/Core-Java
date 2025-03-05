package com.fileio.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// Problem Statement:
// Account class has instance members - 
// int accNo, String name, double balance and printDetails()
// Add a code to serialize the object of Account class in a file "account.dat".
// After serialization, deserialize the object from the file and print its details.

@SuppressWarnings("serial")
public class Account implements Serializable {

    private int accNo;
    private String name;
    private double balance;

    static int count = 100;  // A static counter to auto-increment account numbers

    // Constructor to initialize account details
    public Account(String name, double balance) {
        this.accNo = count++;  // Increment the static counter and assign it as accNo
        this.name = name;
        this.balance = balance;
    }

    
    // Print the details of the account by calling the toString method
    public void printDetails() {
        System.out.println("Account [accNo = " + accNo + ", name = " + name + ", balance = " + balance + "]");  // Call the overridden toString method
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
    	
        // Create a FileOutputStream to write the serialized object to a file
        FileOutputStream fout = new FileOutputStream("D:/Java FileIO_Serializable/account.dat");

        // Create an ObjectOutputStream to serialize the object
        ObjectOutputStream os = new ObjectOutputStream(fout);

        // Create an Account object to be serialized
        Account acc1 = new Account("Sam", 50000.0);
        
        // Serialize the Account object into the file
        os.writeObject(acc1); // Serialization
        os.close();  // Close the output stream

        // Create a FileInputStream to read the serialized object from the file
        FileInputStream fin = new FileInputStream("D:/Java FileIO_Serializable/account.dat");

        // Create an ObjectInputStream to deserialize the object
        ObjectInputStream oin = new ObjectInputStream(fin);

        // Deserialize the object from the file and cast it to Account
        Account acc2 = (Account) oin.readObject(); // Deserialization

        // Print the deserialized Account object using the toString method
        acc2.printDetails();  // display details

        // Close the input stream
        fin.close();
        oin.close();
    }
}
