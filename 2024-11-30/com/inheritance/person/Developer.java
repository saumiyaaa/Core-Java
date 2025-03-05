package com.inheritance.person;

// Subclass Developer extending Employee
public class Developer extends Employee {
    
    protected int no_projects;    // Number of projects handled by the Developer
    protected double project_amt; // Amount earned per project

    // Default constructor
    public Developer() {
        // super(); // Optional because it is always called implicitly
        // Superclass SHOULD HAVE DEFAULT CONSTRUCTOR
        // Otherwise, a compile-time error occurs because the default constructor 
        // of the superclass is called implicitly.
        no_projects = 2;        // Default value for projects
        project_amt = 12000;    // Default value for project amount
    }

    // Parameterized constructor
    public Developer(String n, Date d, Address a, double sal, int np, double amt) {
        super(n, d, a, sal); // Explicit call to the superclass's parameterized constructor
        // This should match the parameter order of the superclass constructor.
        no_projects = np;    // Assign number of projects
        project_amt = amt;   // Assign project amount
    }

    @Override
    public String toString() {
        // Use superclass's toString() to display Employee details
        // and add Developer-specific details
        return super.toString() + "\nNo of Projects: " + no_projects + "\nProject Amount: " + project_amt;
    }
}
