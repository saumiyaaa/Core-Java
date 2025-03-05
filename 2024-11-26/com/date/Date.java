package com.date;

// A class representing a date
public class Date {

    // Private instance variables for encapsulation
    private int day;    // Day of the date
    private int month;  // Month of the date
    private int year;   // Year of the date

   /* // Method to initialize the date with default values
    public void initDate() {
        day = 10;         // Default day
        month = 10;       // Default month
        year = 2010;      // Default year
    } */
    
    Date(){ // Default Constructor for the Date class
    	
    	 day = 10;         // Default day
         month = 10;       // Default month
         year = 2010;      // Default year
    }

    Date(int d, int m, int y){ // Parameterized Constructor
    	
    	day = d;
    	month = m;
    	year = y;
    }
    // Method to print the date in "day/month/year" format
    public void printDate() {
        System.out.println(day + "/" + month + "/" + year);
    }
}
