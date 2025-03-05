package com.moverloading.show;

public class OverloadMain {

    public static void main(String[] args) {
        Overload overload = new Overload();

        // Passing two int arguments to the show method
        overload.show(5, 10); 
        // Explanation of Output:
        // 1. The method show(int, int) does not exist, so Java looks for the closest match.
        // 2. Java performs type promotion:
        //    - int can be promoted to float (widening conversion).
        //    - int can also be promoted to double.
        // 3. Among the overloaded methods, both show(float, float) and show(double, double) are valid candidates.
        // 4. Java selects show(float, float) because float is narrower (closer to int) than double.
        // 5. Therefore, the output is "Addition of Float".
    }
}
