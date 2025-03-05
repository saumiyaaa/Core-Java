package com.inheritance.electronicdevice;

// Base class representing an electronic device
public class ElectronicDevice {

    // Protected attributes to store brand, color, and price
	protected String brand, color;
	protected double price;

    // Default constructor initializing with default values
    ElectronicDevice() {
        brand = "SAMSUNG";
        color = "BLACK";
        price = 30000;
    }

    // Parameterized constructor to initialize with specific values
    ElectronicDevice(String b, String c, double p) {
        brand = b;
        color = c;
        price = p;
    }

    // Method to return a string representation of the object
    public String toString() {
        return "BRAND: " + brand + "\nCOLOR: " + color + "\nPRICE: " + price;
    }
}
