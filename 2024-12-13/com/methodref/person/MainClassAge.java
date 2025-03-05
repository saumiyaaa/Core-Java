package com.methodref.person;

import java.util.ArrayList;
import java.util.Collections;

public class MainClassAge {
    
    // Reference to instance method 
    
    public static void main(String[] args) {
        
        ArrayList<Person> arr = new ArrayList<>();
        
        arr.add(new Person(30, "Kakashi Hatake"));
        arr.add(new Person(17, "Naruto Uzumaki"));
        arr.add(new Person(17, "Sasuke Uchiha"));
        arr.add(new Person(17, "Sakura Haruno"));

        /*
         * Using Collections.sort to sort the 'arr' list based on the custom comparison logic.
         * 
         * Collections.sort takes two arguments:
         * 1. The list to be sorted (arr in this case).
         * 2. A Comparator, which defines the sorting logic.
         * 
         * Here, we pass a method reference PersonComparator::compareAge:
         * - 'PersonComparator' is the class name.
         * - 'compareAge' is a static method that compares two Person objects by age.
         * 
         * How it works:
         * - The method reference PersonComparator::compareAge is automatically used 
         *   as the implementation of the Comparator's compare method.
         * - For every pair of Person objects in the list, compareAge is called:
         *   e.g., PersonComparator.compareAge(person1, person2);
         * - The method returns:
         *   - A negative value if person1's age is less than person2's age.
         *   - Zero if their ages are equal.
         *   - A positive value if person1's age is greater than person2's age.
         * 
         * This ensures the list is sorted in ascending order of age.
         */
        Collections.sort(arr, PersonComparator::compareAge);
        
        for (Person person : arr) {
            // Iterating over the sorted list and printing the age of each person
            System.out.println(person.getAge());
        }
    }
}
