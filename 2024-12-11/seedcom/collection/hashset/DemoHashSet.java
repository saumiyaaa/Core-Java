package seedcom.collection.hashset;

import java.util.HashSet;

public class DemoHashSet {
    
    public static void main(String[] args) {
        
        // Creating a HashSet to store elements
        HashSet<Integer> hSet = new HashSet<>();
        
        // Adding elements to the HashSet
        hSet.add(50);   // Adding integer 50
        hSet.add(40);   // Adding integer 40
        hSet.add(8);    // Adding integer 8
        hSet.add(89);   // Adding integer 89
        hSet.add(55);   // Adding integer 55
        hSet.add(null); // Adding null value
        
        // Printing the elements in the HashSet
        System.out.println("-----Printing HashSet-----");
        System.out.println(hSet);
        
        // Removing an element (89) from the HashSet
        System.out.println("\n-----After removing Element 89-----");
        hSet.remove(89); // Removing element 89
        System.out.println(hSet);
        
        // Checking if the HashSet contains specific elements
        System.out.println("\nDoes HashSet contain element 89 ? " + hSet.contains(89)); // Should return false
        System.out.println("Does HashSet contain element 8 ? " + hSet.contains(8));   // Should return true
        
        // Getting the size of the HashSet
        System.out.println("\nSize of HashSet: " + hSet.size());
        
        // Checking if the HashSet is empty
        System.out.println("\nIs HashSet Empty ? " + hSet.isEmpty()); // Should return false
        
        // Removing all elements from the HashSet
        hSet.removeAll(hSet); // This will remove all elements
        System.out.println("\nAfter using removeAll(): " + hSet); // Should print an empty HashSet
        
        System.out.println("-------------------------------------------------");
        
    }
}
