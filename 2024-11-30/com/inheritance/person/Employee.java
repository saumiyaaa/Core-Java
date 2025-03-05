package com.inheritance.person;

// Base class Employee
public class Employee extends Person{
    
    // Instance variables
    protected int EmployeeId;               // Employee ID
    
    protected double Basic_Salary;          // Basic Salary
    protected double Medical;               // Medical Allowance
    protected double Total_Salary;            // Total Salary (calculated)
    protected double HRA;                   // House Rent Allowance (50% of Basic Salary)
    protected double PF;                    // Provident Fund (120% of Basic Salary)
    protected double PT;                    // Professional Tax (fixed value)
    protected static int count;
    
    static {
    	count = 0;
    }

    // Default constructor
    public Employee() {
     
    	super();
    	EmployeeId = ++count ;             // Auto Generate Employee ID                    
        Basic_Salary = 1000000.00;        // Default Basic Salary
        Medical = 300000;                 // Default Medical Allowance
        HRA = 0.5 * Basic_Salary;         // Calculate HRA
        PF = 1.2 * Basic_Salary;          // Calculate PF
        PT = 200;                         // Fixed Professional Tax
    }

    // Parameterized constructor
    public Employee(String n, Date d, Address a,double BasicSal) {
    	
    	super(n,d,a);
        EmployeeId = ++count;                // Auto Generate Employee ID       
        Basic_Salary = BasicSal;            // Assign Basic Salary
        Medical = 300000;                   // Medical Allowance
        HRA = 0.5 * Basic_Salary;           // Calculate HRA
        PF = 1.2 * Basic_Salary;            // Calculate PF
        PT = 200;                           // Fixed Professional Tax
    }
    
    public double SalCalc() {
        // Formula: Total Salary = Basic Salary + Net Salary
        Total_Salary = Basic_Salary + HRA + Medical - (PF + PT);  
        return Total_Salary;                         
    }


    @Override
    public String toString() {
        // Display the basic details of the Employee
    	SalCalc();
        return (super.toString()+"\nEmployee Id: " + EmployeeId + "\nBasic Salary: " + Basic_Salary+"\nTotal Salary: "+Total_Salary);
    }
}
