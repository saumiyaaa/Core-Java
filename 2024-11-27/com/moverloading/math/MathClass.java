package com.moverloading.math;

public class MathClass {
	
	// Method to add two integers
    public void add(int a, int b) {
        System.out.println("Addition of 2 Int Nos: " + (a + b));
    }

    // Method to add two float
    public void add(float a, float b) {
        System.out.println("Addition of 3 Int Nos: " + (a + b));
    }

    // Method to add two Strings
    public void add(String a, String b) {
        System.out.println("Addition of 2 Strings: " + (a + " " + b));
    }
    
    public void add(int a, int b, float c) {
        System.out.println("Addition of Int and Float Nos: " + (a + b + c));
    }
    
    public void add(int a, int b, int c) {
        System.out.println("Addition of 3 Int Nos: " + (a + b + c));
    }

}
