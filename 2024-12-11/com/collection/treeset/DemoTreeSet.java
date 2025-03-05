package com.collection.treeset;

import java.util.TreeSet;

public class DemoTreeSet {
    
    public static void main(String[] args) {
        
        // Creating a TreeSet to store Integer elements
        TreeSet<Integer> tSet = new TreeSet<>();
        
        // Adding elements to the TreeSet
        tSet.add(50);
        tSet.add(40);
        tSet.add(8);
        tSet.add(89);
        tSet.add(55);
        tSet.add(10);
        tSet.add(15);
        tSet.add(97);
        tSet.add(82);
        tSet.add(49);
        
        // Printing the TreeSet - elements will be sorted in natural order (ascending)
        System.out.println("-----Printing TreeSet-----");
        System.out.println(tSet);
        
        // Removing an element (89) from the TreeSet
        System.out.println("\n-----After removing Element 89-----");
        tSet.remove(89);
        System.out.println(tSet);
        
        // Checking if specific elements are present in the TreeSet
        System.out.println("\nDoes TreeSet contain element 89 ? " + tSet.contains(89));
        System.out.println("Does TreeSet contain element 8 ? " + tSet.contains(8));
        
        // Getting the size of the TreeSet
        System.out.println("\nSize of TreeSet: " + tSet.size());
        
        // Checking if the TreeSet is empty
        System.out.println("\nIs TreeSet Empty ? " + tSet.isEmpty());
        
        // Retrieving the first (smallest) element of the TreeSet
        System.out.println("\n-----After using first()-----" + tSet.first());
        
        // Retrieving the last (largest) element of the TreeSet
        System.out.println("\n-----After using last()-----" + tSet.last());
        
        // Finding the greatest element less than or equal to 45
        System.out.println("\n-----After using floor(45)-----" + tSet.floor(45));
        
        // Finding the smallest element greater than or equal to 45
        System.out.println("\n-----After using ceiling(45)-----" + tSet.ceiling(45));
        
        // Retrieving and removing the first (smallest) element
        System.out.println("\n-----Using pollFirst(): " + tSet.pollFirst());
        System.out.println("-----After using pollFirst()-----" + tSet);
        
        // Retrieving and removing the last (largest) element
        System.out.println("\n-----Using pollLast(): " + tSet.pollLast());
        System.out.println("-----After using pollLast()-----" + tSet);
        
        // Removing all elements from the TreeSet
        tSet.removeAll(tSet);
        System.out.println("\nAfter using removeAll(): " + tSet);
        
        System.out.println("-------------------------------------------------");
    }
}
