package com.inheritance.item;

class MusicCD extends Item {
    private String artist;
    private int volume;

    public MusicCD() {
        super(); // Calls the default constructor of the superclass
        artist = "The Beatles";
        volume = 1;
    }
    
    // Constructor
    public MusicCD(String title, String publisher, int yearPublished, String ISBN, double price, String artist, int volume) {
        super(title, publisher, yearPublished, ISBN, price);
        this.artist = artist;
        this.volume = volume;
    }

    // toString method to display MusicCD details
    @Override
    public String toString() {
        return super.toString() + ", Artist: " + artist + ", Volume: " + volume;
    }

}
