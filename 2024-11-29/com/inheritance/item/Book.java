package com.inheritance.item;

class Book extends Item {
    private String author;
    private String edition;
    private int volume;

    // Default constructor
    public Book() {
        super(); // Calls the default constructor of the superclass
        author = "Joshua Bloch";
        edition = "3rd Edition";
        volume = 1;
    }
    
    // Constructor
    public Book(String title, String publisher, int yearPublished, String ISBN, double price, String author, String edition, int volume) {
        super(title, publisher, yearPublished, ISBN, price);
        this.author = author;
        this.edition = edition;
        this.volume = volume;
    }

    // toString method to display Book details
    @Override
    public String toString() {
        return super.toString() + ", Author: " + author + ", Edition: " + edition + ", Volume: " + volume;
    }

}
