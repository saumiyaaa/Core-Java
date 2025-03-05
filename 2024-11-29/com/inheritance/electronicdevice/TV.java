package com.inheritance.electronicdevice;

// Subclass of ElectronicDevice representing a TV
public class TV extends ElectronicDevice {

    // Protected attribute to store the model of the TV
	protected String model;

    // Default constructor initializing with default values
    TV() {
        super(); // Calls the default constructor of the parent class
        model = "SMART TV";
    }

    // Parameterized constructor to initialize with specific values
    TV(String b, String c, double p, String m) {
        super(b, c, p); // Calls the parameterized constructor of the parent class
        model = m;
    }

    // Method to return a string representation of the object, including the model
    public String toString() {
        return super.toString() + "\nMODEL: " + model;
    }
}
