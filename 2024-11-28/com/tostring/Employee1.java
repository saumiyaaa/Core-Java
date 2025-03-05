package com.tostring;

public class Employee1 {
	
	    
	    // Instance variables
	    private int EmployeeId;               // Employee ID
	    private String Employee_Name;         // Employee Name
	    private double Basic_Salary;          // Basic Salary
	    private double Medical;               // Medical Allowance
	    private double Net_Salary;            // Net Salary (calculated)
	    private double Gross_Salary;          // Gross Salary (calculated)
	    private double HRA = 0.5 * Basic_Salary;  // House Rent Allowance (50% of Basic Salary)
	    private double PF = 1.2 * Basic_Salary;   // Provident Fund (120% of Basic Salary)
	    private double PT = 200;              // Professional Tax (fixed value)

	    // Default constructor
	    public Employee1() {
	        // Initialize with default values
	        EmployeeId = 12345;                 // Default Employee ID
	        Employee_Name = "SAM";              // Default Employee Name
	        Basic_Salary = 1000000.00;          // Default Basic Salary
	        Medical = 300000;                   // Default Medical Allowance
	    }

	    // Parameterized constructor
	    public Employee1(int Id, String Name, double BasicSal, double Med) {
	        EmployeeId = Id;                    // Assign Employee ID
	        Employee_Name = Name;               // Assign Employee Name
	        Basic_Salary = BasicSal;            // Assign Basic Salary
	        Medical = Med;                      // Assign Medical Allowance
	    }


	    public double GrossSalcalc() {
	        // Formula: Gross Salary = Basic Salary + HRA + Medical
	        Gross_Salary = Basic_Salary + HRA + Medical;  
	        return Gross_Salary;                         
	    }


	    public double NetSalcalc() {
	        // Formula: Net Salary = Gross Salary - (PF + PT)
	        Net_Salary = Gross_Salary - (PF + PT);
	        return Net_Salary;
	    }
	    
	    public String toString() {
	    	
	    	    GrossSalcalc();  // Automatically calculate Gross Salary
		        NetSalcalc();    // Automatically calculate Net Salary
		        return("Employee Id: " + EmployeeId+"\nEmployee Name: " + Employee_Name+"\nBasic Salary: " + Basic_Salary+"\nGross Salary: " + Gross_Salary+"\nNet Salary: " + Net_Salary);

	    }

	  
}
