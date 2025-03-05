package com.collection.linkedlist;

import java.util.LinkedList;

public class Demo1 {

    public static void main(String[] args) {
        
        // Create a LinkedList without specifying a type (raw type).
        LinkedList<Object> l1 = new LinkedList<>();

        // Add elements of different data types to the LinkedList.
        l1.add(12);          // Adding an integer
        l1.add(45.3);        // Adding a double
        System.out.println(l1);  // Print the LinkedList: [12, 45.3]

        // Add an element at a specific position.
        l1.add(0, 23.4f);    // Adding a float at index 0
        System.out.println(l1);  // Print the LinkedList: [23.4, 12, 45.3]

        // Add more elements of different types.
        l1.add("Sam");       // Adding a String
        l1.add('C');         // Adding a character
        System.out.println(l1);  // Print the LinkedList: [23.4, 12, 45.3, "Sam", 'C']

        // Remove the first element using remove().
        l1.remove();         // Removes the first element (23.4)
        System.out.println(l1);  // Print the LinkedList: [12, 45.3, "Sam", 'C']

        // Remove an element at a specific index.
        l1.remove(2);        // Removes the element at index 2 ("Sam")
        System.out.println(l1);  // Print the LinkedList: [12, 45.3, 'C']

        // Check if a specific element is present in the LinkedList.
        System.out.println(l1.contains(23.4));  // Checks if 23.4 is present. Output: false
    }
}
