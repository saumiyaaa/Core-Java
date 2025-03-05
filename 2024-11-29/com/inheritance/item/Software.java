package com.inheritance.item;

class Software extends Item {
    private String version;

    // Default constructor
    public Software() {
        super(); // Calls the default constructor of the superclass
        version = "Windows 10 Pro";
    }
    
    // Constructor
    public Software(String title, String publisher, int yearPublished, String ISBN, double price, String version) {
        super(title, publisher, yearPublished, ISBN, price);
        this.version = version;
    }

    // toString method to display Software details
    @Override
    public String toString() {
        return super.toString() + ", Version: " + version;
    }

}
