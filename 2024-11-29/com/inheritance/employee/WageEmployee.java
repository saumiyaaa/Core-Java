package com.inheritance.employee;

public class WageEmployee extends Employee{
	
	protected int hours;
	protected float rate;
	
	protected WageEmployee(){
		
		hours = 40; 
        rate = 15.50f; 
	}
	
	protected WageEmployee( int Id, String Name, double BasicSal, int hrs, float r) {
		
		super(Id, Name, BasicSal);
		hours = hrs; 
        rate = r; 
	}
	
	protected double calcAmt() {
		return hours*rate;
	}
	
	// Overridden method to calculate total salary
    @Override 
	public double SalCalc() {
	        // Calculate the wage based on hours worked and hourly rate
	        double wage = calcAmt();  // Calls the calcAmt() method to calculate wage

	        // Now calculate the total salary by including the wage (for wage employees)
	        Total_Salary = Basic_Salary + HRA + Medical - (PF + PT) + wage;

	        return Total_Salary;  // Return the total salary (including hourly wage)
	    }
    
    public String toString() {
    	return super.toString()+"\nWages: "+calcAmt(); 
    }
}
