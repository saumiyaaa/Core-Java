package com.inheritance.electronicdevice;

// Subclass of ElectronicDevice representing a mobile phone
public class MobilePhone extends ElectronicDevice {

    // Protected attribute to store the model of the mobile phone
	protected String model;

    // Default constructor initializing with default values
    MobilePhone() {
        super(); // Calls the default constructor of the parent class (ElectronicDevice)
        model = "GALAXY S24 ULTRA"; // Default model name for MobilePhone
    }

    // Parameterized constructor to initialize with specific values
    MobilePhone(String b, String c, double p, String m) {
        super(b, c, p); // Calls the parameterized constructor of the parent class
        model = m; // Assigns the specific model name
    }

    // Overriding the toString() method to include model information
    public String toString() {
        return super.toString() + "\nMODEL: " + model; // Combines parent class details with model
    }
}
