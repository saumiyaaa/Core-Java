package com.inheritance.item;

public class Item {
	
    protected String title;
    protected String publisher;
    protected int yearPublished;
    protected String ISBN;
    protected double price;

    public Item() {
        title = "Effective Java";
        publisher = "Addison-Wesley";
        yearPublished = 2018;
        ISBN = "0134685997";
        price = 45.00;
    }
    
    // Constructor
    public Item(String title, String publisher, int yearPublished, String ISBN, double price) {
        this.title = title;
        this.publisher = publisher;
        this.yearPublished = yearPublished;
        this.ISBN = ISBN;
        this.price = price;
    }

    // toString method to display Item details
    @Override
    public String toString() {
        return "Title: " + title + ", Publisher: " + publisher + ", Year Published: " + yearPublished +
               ", ISBN: " + ISBN + ", Price: $" + price;
    }

}
