package com.objectmethods;

public class DateMain {

    public static void main(String[] args) {
        // Create two Date objects with the same values
        Date d1 = new Date(11, 11, 2011);
        Date d2 = new Date(11, 11, 2011);

        // Print the hash codes of both objects
        System.out.println("Hash Code of d1: " + d1.hashCode());
        System.out.println("Hash Code of d2: " + d2.hashCode());

        // Compare object references using ==
        if (d1 == d2) {
            System.out.println("SAME REFERENCE MEMORY");
        } else {
            System.out.println("DIFFERENT REFERENCE MEMORY");
        }

        // Compare objects logically using equals()
        if (d1.equals(d2)) {
            System.out.println("SAME OBJECT");
        } else {
            System.out.println("DIFFERENT OBJECT");
        }
    }
}
