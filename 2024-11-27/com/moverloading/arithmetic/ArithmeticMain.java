package com.moverloading.arithmetic;

public class ArithmeticMain {

    public static void main(String[] args) {

        // Create an instance of the ArithmeticMethodOverloading class
        Arithmetic amo = new Arithmetic();

        // Call to add(int, float)
        amo.add(3, 8.5f); 
        // Explanation:
        // 1. The arguments (3, 8.5f) match the method add(int, float) directly.
        // 2. Output: "Addition of Int and Float Nos: 11.5"

        // Call to add(int, int)
        amo.add(45, 32); 
        // Explanation:
        // 1. The arguments (45, 32) match the method add(int, int) directly.
        // 2. Output: "Addition of 2 Int Nos: 77"

        // Call to add(double, double, double)
        amo.add(2.5, 5.5, 7.5); 
        // Explanation:
        // 1. The arguments (2.5, 5.5, 7.5) match the method add(double, double, double) directly.
        // 2. Output: "Addition of 3 Double Nos: 15.5"

        // Call to add(int, int, int)
        amo.add(4, 5, 8); 
        // Explanation:
        // 1. The arguments (4, 5, 8) match the method add(int, int, int) directly.
        // 2. Output: "Addition of 3 Int Nos: 17"

        // Call to add(float, float)
        amo.add(4.5f, 6.5f); 
        // Explanation:
        // 1. The arguments (4.5f, 6.5f) match the method add(float, float) directly.
        // 2. Output: "Addition of 2 Float Nos: 11.0"
    }
}
