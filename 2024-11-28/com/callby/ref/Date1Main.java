package com.callby.ref; // Package declaration to organize the class

public class Date1Main {

    public static void main(String[] args) {

        // Create an array of DatePassByRef objects with 2 elements
        Date1 arr[] = new Date1[2];

        // Initialize the first date object with specific values
        arr[0] = new Date1(20, 06, 2005);

        // Initialize the second date object with specific values
        arr[1] = new Date1(01, 02, 2001);

        // Print the date objects before swapping
        System.out.println("BEFORE SWAP : " + arr[0] + " " + arr[1]);

        // Call the static swapDate method to swap the objects in the array
        Date1.swapDate(arr);

        // Print the date objects after swapping
        System.out.println("AFTER SWAP : " + arr[0] + " " + arr[1]);
    }
}
