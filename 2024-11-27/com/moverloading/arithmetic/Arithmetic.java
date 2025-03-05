package com.moverloading.arithmetic;

public class Arithmetic {

    // Method to add two integers
    public void add(int a, int b) {
        System.out.println("Addition of 2 Int Nos: " + (a + b));
    }

    // Method to add three integers
    public void add(int a, int b, int c) {
        System.out.println("Addition of 3 Int Nos: " + (a + b + c));
    }

    // Method to add two floats
    public void add(float a, float b) {
        System.out.println("Addition of 2 Float Nos: " + (a + b));
    }

    // Method to add an integer and a float
    public void add(int a, float b) {
        System.out.println("Addition of Int and Float Nos: " + (a + b));
    }

    // Method to add three doubles
    public void add(double a, double b, double c) {
        System.out.println("Addition of 3 Double Nos: " + (a + b + c));
    }
}
