package com.employee;

// Main class to test the Employee class
public class EmployeeMain {

    public static void main(String[] args) {
        // Create an Employee object using the default constructor
        Employee e1 = new Employee();
        System.out.println(); // Print a blank line for readability
        e1.printDetails();  // Print details of the default employee
        
        System.out.println();

        // Create an Employee object using the parameterized constructor
        Employee e2 = new Employee(98765, "Hinali", 700000.00, 200000);
        e2.printDetails();  // Print details of the parameterized employee
    }
}
