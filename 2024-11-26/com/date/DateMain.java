package com.date;

// Main class to test the Date class
public class DateMain {

    public static void main(String[] args) {

        /* 
         * To create an object:
         * Syntax: classname reference-variable = new classname();
         */
    	
    	//an object of the Student class is being created and is referenced by the variable st
    	//Date: This is the name of the class that we are creating an object of.
    	//d,d2: This is a reference variable of type Student that will hold the reference to the object created.
    	//new: new keyword is used to allocate memory for the object at runtime in the heap memory area.
    	//     This is where all objects in Java are stored.
    	//Date(): is the constructor of the Date class, which may initialize the object's fields.

        // Create an instance or object of the Date class
        Date d = new Date(); // First object
        //d.initDate();        // Initialize the date with default values
        d.printDate();       // Print the initialized date

        // Create another instance of the Date class
        Date d2 = new Date(12,03,24); 
        
        d2.printDate();    
     // 1. `Date d2`: Declares a reference variable `d2` of type `Date`.
     // 2. `new Date(12,03,24)`: Creates a new `Date` object using the parameterized constructor of the `Date` class.
//         - The constructor is called with arguments `12` (day), `03` (month), and `24` (year).
//         - These values will initialize the instance variables `day`, `month`, and `year` of the `d2` object.

    }
}
