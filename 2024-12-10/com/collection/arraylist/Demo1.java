package com.collection.arraylist;

import java.util.ArrayList;

public class Demo1 {

    public static void main(String[] args) {
        
        // Create an ArrayList without specifying a type (raw type).
        ArrayList<Object> a1 = new ArrayList<>();

        // Add elements to the ArrayList. Since it's raw, any data type can be added.
        a1.add(10);         // Adding an integer
        a1.add(5);          // Adding another integer
        a1.add(44);         // Adding another integer
        a1.add(53);         // Adding another integer
        a1.add(10);         // Adding a duplicate integer
        a1.add(null);       // Adding a null value
        System.out.println(a1);  // Print the ArrayList

        // Add an element at a specific index position.
        a1.add(2, 80);      // Adds the integer 80 at index 2
        System.out.println(a1);  // Print the ArrayList after adding the element

        // Retrieve an element at a specific index using get(index).
        System.out.println(a1.get(4));  // Gets the element at index 4 and prints it

        // Remove an element at a specific index.
        a1.remove(3);       // Removes the element at index 3
        System.out.println(a1);  // Print the ArrayList after removal

        // Get the size of the ArrayList using size().
        System.out.println(a1.size()); // Prints the number of elements in the ArrayList

        // Modify an element at a specific index using set(index, element).
        a1.set(0, 90);      // Updates the element at index 0 to 90
        System.out.println(a1);  // Print the ArrayList after modification

        // Adding elements of different data types since the ArrayList is of raw type.
        a1.add("Sam");      // Adding a String
        a1.add('C');        // Adding a character
        System.out.println(a1);  // Print the ArrayList after adding different data types

        System.out.println();

        // Using an enhanced for loop to iterate through the ArrayList.
        // Since the ArrayList is of raw type, it holds objects of type Object.
        for (Object x : a1) {
            System.out.println(x);  // Prints each element of the ArrayList
        }
    }
}
