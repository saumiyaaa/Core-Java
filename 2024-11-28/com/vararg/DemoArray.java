package com.vararg; // Package declaration for organizing the class

// Class definition
public class DemoArray {
	
	public void Display(int ...a) {
		for(int x : a) {
			System.out.println(x);
		}
	}

    // Main method, the entry point of the program
    public static void main(String[] args) {

        // Declare and initialize an array of size 5. Default values will be 0 (since it's an int array).
       // int arr[] = new int[5];

        // Declare and initialize an array with specific values using the `new` keyword.
        int arr1[] = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        
        for(int x: arr1) {
        	System.out.print(x+" ");
        }
        
        System.out.println("\n");

        // Declare and initialize an array using shorthand notation.
        // Using First class object notation.
        float arr2[] = {1.2f, 2.5f, 3.7f, 4.2f, 5.5f};
            
        System.out.println("Using for Loop \n");

        // Loop through the array `arr2` using its length property to print each element.
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]); // Print each element of the array.
        }
        
        System.out.println("\n");
        
        System.out.println("Using for-each Loop ");
        
        System.out.println("\n");
        
        /*
         * SYNTAX : FOR-EACH LOOP
         * 
         * for(data_type var : collectionname)
         */
        
     // Enhanced for loop to iterate over each element in the array `arr2`
     // for-each loop   
        for (float a : arr2) { 
            // 'a' is a temporary variable that holds the value of each element in the array during each iteration
            System.out.println(a); // Print the current element stored in 'a'
        }
        
        DemoArray dArray = new DemoArray ();
        
        dArray.Display(90,80,70,60,50);
        
        dArray.Display(arr1);
        

    }
}
