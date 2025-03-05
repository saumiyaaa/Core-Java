package com.student;

// Main class to test the Student class
public class StudentMain {

    public static void main(String[] args) {
    	
    	//an object of the Student class is being created and is referenced by the variable st
    	//Student: This is the name of the class that we are creating an object of.
    	//st: This is a reference variable of type Student that will hold the reference to the object created.
    	//new: new keyword is used to allocate memory for the object at runtime in the heap memory area.
    	//     This is where all objects in Java are stored.
    	//Student(): is the constructor of the Student class, which may initialize the object's fields.
        
        Student st = new Student();// Create an instance or object of the Student class

        // Initialize the student details using default values
        st.initStudent();
        st.printDetails(); // Print the default student details

        // Get and set the student's name
        st.getName();                // Fetches the current name
        st.setName("Riya");          // Updates the name to "Riya"

        // Get and set the student's roll number
        st.getRollNo();              // Fetches the current roll number
        st.setRollNo(34);            // Updates the roll number to 34

        // Get and set the student's percentage
        st.getPercentage();          // Fetches the current percentage
        st.setPercentage(92.45);     // Updates the percentage to 92.45%

        // Print the updated student details
        st.printDetails();
    }
}
