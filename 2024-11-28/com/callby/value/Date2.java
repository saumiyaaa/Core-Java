package com.callby.value; // Package declaration to organize the class

public class Date2 {
    
    private int day, month, year; // Instance variables for day, month, and year

    // Default Constructor for the Date class
    Date2() { 
        day = 10;         // Default day
        month = 10;       // Default month
        year = 2010;      // Default year
    }

    // Parameterized Constructor to initialize the date with specific values
    Date2(int d, int m, int y) { 
        day = d;
        month = m;
        year = y;
    }

    // Overriding the toString() method to display the date in "day/month/year" format
    public String toString() {
        return (day + "/" + month + "/" + year); 
    }

    // Method to attempt swapping two DateCallByValue objects using call by value
    public static void swap(Date2 d1, Date2 d2) {
    	
        Date2 temp = d1; // Store d1 in a temporary variable
        d1 = d2;                   // Assign d2 to d1
        d2 = temp;                 // Assign temp (original d1) to d2
      
    }
}
