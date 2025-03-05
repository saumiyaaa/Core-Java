package com.inheritance.electronicdevice;

// Subclass of ElectronicDevice representing a computer
public class Computer extends ElectronicDevice {

    // Protected attribute to store the model of the computer
    protected String model;

    // Default constructor initializing with default values
    Computer() {
        super(); // Calls the default constructor of the parent class
        model = "GALAXY BOOK 4";
    }

    // Parameterized constructor to initialize with specific values
    Computer(String b, String c, double p, String m) {
        super(b, c, p); // Calls the parameterized constructor of the parent class
        model = m;
    }

    // Method to return a string representation of the object, including the model
    public String toString() {
        return super.toString() + "\nMODEL: " + model;
    }
}
