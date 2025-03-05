package com.inheritance.electronicdevice;

// Subclass of TV representing an LCD TV
public class LCD extends TV {

    // Protected attribute to store the display type
	protected String display;

    // Default constructor initializing with default values
    LCD() {
        super(); // Calls the default constructor of the parent class
        display = "LCD";
    }

    // Parameterized constructor to initialize with specific values
    LCD(String b, String c, double p, String m, String d) {
        super(b, c, p, m); // Calls the parameterized constructor of the parent class
        display = d;
    }

    // Method to return a string representation of the object, including the display type
    public String toString() {
        return super.toString() + "\nDISPLAY: " + display;
    }
}
