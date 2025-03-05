package com.collection.vector;

import java.util.Collections;
import java.util.Stack;

public class Demo1 {

    public static void main(String[] args) {

        // Create a Stack instance without specifying a type (raw type).
        Stack <Integer> s1 = new Stack<>();

        // Add elements to the Stack using push() method.
        s1.push(10);        // Push an integer onto the stack
        // s1.push("SAM");  // Uncommenting this will allow adding a String (heterogeneous data), but will cause issues with sorting.
        s1.push(4);         // Push another integer
        s1.push(66);        // Push another integer
        // s1.push(23.4f);  // Uncommenting this will allow adding a Float, but will cause issues with sorting.
        
        // Display the Stack.
        System.out.println(s1); // Prints the Stack: [10, 4, 66]

        // Remove the top element using pop() and display it.
        System.out.println(s1.pop()); // Removes and returns the last element (66)

        // Display the Stack after the pop operation.
        System.out.println(s1); // Prints the Stack: [10, 4]

        // Retrieve the top element using peek() without removing it.
        System.out.println(s1.peek()); // Returns the last element (4)

        // Display the Stack after peek operation to show it remains unchanged.
        System.out.println(s1); // Prints the Stack: [10, 4]
        System.out.println();

        // Iterate over the elements of the Stack using an enhanced for loop.
        for (Object x : s1) {
            System.out.println(x); // Prints each element in the Stack
        }

        // Sort the Stack using Collections.sort() method.
        // Sorting is possible only if all elements in the Stack are of the same data type.
        Collections.sort(s1); 
        System.out.println(s1); // Prints the sorted Stack: [4, 10]

    }
}
