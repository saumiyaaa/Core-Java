package com.callby.value; // Package declaration to organize the class

public class Date2Main {

    public static void main(String[] args) {

        // Create two DateCallByValue objects
        Date2 date1 = new Date2(20, 06, 2005);
        Date2 date2 = new Date2(01, 02, 2001);

        // Print the objects before swapping
        System.out.println("BEFORE SWAP: date 1 = " + date1 + ", date 2 = " + date2);

        // Attempt to swap the objects using call by value
        Date2.swap(date1, date2);
        
        System.out.println();

        // Print the objects after swapping
        System.out.println("AFTER SWAP: date 1 = " + date1 + ", date 2 = " + date2);
    }
}
