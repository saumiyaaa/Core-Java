package com.exceptionthrow;

// using keyword 'throw'

public class DemoThrow1 {

    public static void division() {

        int n = 10; // Dividend
        int d = 0;  // Divisor (set to zero to simulate an error scenario)

        if (d == 0) {
           
            // This statement explicitly throws an ArithmeticException when the divisor is 0.
            // The `throw` keyword is used to manually throw an exception at this point in the method.
            // Once this exception is thrown, the method's execution stops, and control is transferred
            // to the nearest exception handler (catch block in `main`).
            throw new ArithmeticException("Cannot Divide by Zero ...");
            // throw new ArithmeticException();
        }

            // The following code is unreachable because the method is already terminated by the `throw` statement.
            // This division operation will never execute as it is after the `throw` keyword.
            float div = (float) n / d; 
            System.out.println(div); // This will never print due to the exception being thrown above.
        }

    

    public static void main(String[] args) {

        try {
            division(); // Call the `division` method which may throw an exception
        } catch (ArithmeticException e) {
            // Prints the exception's message to the console in red (standard error output).
            // In the `catch` block, we handle the exception that was thrown by `division()`.
            // Here, `e.getMessage()` prints the custom error message we passed when throwing the exception.
            // `System.err` ensures the message is displayed in the error stream, typically shown in red in the console.
            System.err.println(e.getMessage()); 
            
            //e.printStackTrace();
        }
    }
}
