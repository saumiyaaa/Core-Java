package com.inheritance.person;

public class Manager extends Employee{
	
	protected int noOfSubordinates;
	protected double incentive_pct;
	
	// Default constructor
    public Manager() {
        // super(); // Optional because it is always called implicitly

    	noOfSubordinates = 2;     
    	incentive_pct = 0.3;    
    }

    // Parameterized constructor
    public Manager(String n, Date d, Address a, double sal, int s, double inct) {
        super(n, d, a, sal); // Explicit call to the superclass's parameterized constructor
        // This should match the parameter order of the superclass constructor.
        noOfSubordinates = s;    
        incentive_pct = inct;  
    }
    
    public double InctCalc() {
    	
    	return noOfSubordinates*incentive_pct*Basic_Salary;
    }
    
    public double SalCalc() {
        // Formula:  Salary = Basic Salary + Net Salary
        Total_Salary = Basic_Salary + HRA + Medical - (PF + PT) + InctCalc();  
        return Total_Salary;                         
    }

    @Override
    public String toString() {
        // Use superclass's toString() to display Employee details
        // and add Manager-specific details
        return super.toString() + "\nNo of Subordinates: " + noOfSubordinates + "\nIncentives: " + InctCalc();
    }
}



