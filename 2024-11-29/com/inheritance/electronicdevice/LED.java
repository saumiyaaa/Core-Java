package com.inheritance.electronicdevice;

// Subclass of TV representing an LED TV
public class LED extends TV {

    // Protected attribute to store the display type
	protected String display;

    // Default constructor initializing with default values
    LED() {
        super(); // Calls the default constructor of the parent class
        display = "LED";
    }

    // Parameterized constructor to initialize with specific values
    LED(String b, String c, double p, String m, String d) {
        super(b, c, p, m); // Calls the parameterized constructor of the parent class
        display = d;
    }

    // Method to return a string representation of the object, including the display type
    public String toString() {
        return super.toString() + "\nDISPLAY: " + display;
    }
}
