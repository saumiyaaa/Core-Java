package com.inheritance.employee;


public class SalesPerson extends Employee{
	
	protected double comm_pct;
	protected int sales_no;
	
	public SalesPerson() {
		
		super();
		comm_pct = 0.5;
		sales_no = 100;
	}
	
	public SalesPerson(int Id, String Name, double BasicSal, double pct, int no) {
		
		super(Id, Name, BasicSal);
		comm_pct = pct;
		sales_no = no;
	}
	
	public double calcCommPCT() {
		
		return comm_pct*Basic_Salary;
	}
	
	   public double SalCalc() {
	        // Formula:  Salary = Basic Salary + Net Salary
	        Total_Salary = Basic_Salary + HRA + Medical - (PF + PT) + calcCommPCT();  
	        return Total_Salary;                         
	    }
	   
	    @Override
	    public String toString() {
	        // Use superclass's toString() to display Employee details
	        // and add Manager-specific details
	        return super.toString() + "\nCommission Percentage: " + comm_pct + "\nSales Amount: " + sales_no;
	    }		
		
}
