package com.callby.ref; // Package declaration to organize the class

public class Date1 {
    
    private int day, month, year; // Instance variables for day, month, and year

    // Default Constructor for the Date class
    Date1() { 
        day = 10;         // Default day
        month = 10;       // Default month
        year = 2010;      // Default year
    }

    // Parameterized Constructor to initialize the date with specific values
    Date1(int d, int m, int y) { 
        day = d;
        month = m;
        year = y;
    }

    // Overriding the toString() method to display the date in "day/month/year" format
    public String toString() {
        return (day + "/" + month + "/" + year); 
    }
    
    // Static method to swap the DatePassByRef objects in the array
    public static void swapDate(Date1 d[]) {
        Date1 temp; // Temporary variable to hold one of the objects during the swap
        temp = d[0];        // Store the first object in temp
        d[0] = d[1];        // Assign the second object to the first position
        d[1] = temp;        // Assign the temp object to the second position
    }
}
