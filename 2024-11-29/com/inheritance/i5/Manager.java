package com.inheritance.i5;

public class Manager extends Employee{
	

	protected static int count = 1;
	protected int MgId [];
	protected double incentives;
	protected int noOfSubordinates;
		
	static {
		
		count=count++;
	}
	
	// Default constructor
    public Manager() {
        // super(); // Optional because it is always called implicitly
    
        MgId = new int [count];
    	noOfSubordinates = 2;     
    	incentives = 12000;    
    }

    // Parameterized constructor
    public Manager(int id, String nm, double sal, int s, double inct) {
        super(id, nm, sal); // Explicit call to the superclass's parameterized constructor
        // This should match the parameter order of the superclass constructor.
        noOfSubordinates = s;    
        incentives = inct;  
    }
    
    public double SalCalc() {
        // Formula:  Salary = Basic Salary + Net Salary
        Total_Salary = Basic_Salary + HRA + Medical - (PF + PT) + incentives;  
        return Total_Salary;                         
    }

    @Override
    public String toString() {
        // Use superclass's toString() to display Employee details
        // and add Manager-specific details
        return super.toString() + "\nNo of Subordinates: " + noOfSubordinates + "\nIncentives: " + incentives;
    }
		


}
