package com.inheritance.employee;

// Base class Employee
public class Employee {
    
    // Instance variables
    protected int EmployeeId;               // Employee ID
    protected String Employee_Name;         // Employee Name
    protected double Basic_Salary;          // Basic Salary
    protected double Medical;               // Medical Allowance
    protected double Total_Salary;            // Total Salary (calculated)
    protected double HRA;                   // House Rent Allowance (50% of Basic Salary)
    protected double PF;                    // Provident Fund (120% of Basic Salary)
    protected double PT;                    // Professional Tax (fixed value)

    // Default constructor
    public Employee() {
     
        EmployeeId = 123;                 // Default Employee ID
        Employee_Name = "SAM";            // Default Employee Name
        Basic_Salary = 1000000.00;        // Default Basic Salary
        Medical = 300000;                 // Default Medical Allowance
        HRA = 0.5 * Basic_Salary;         // Calculate HRA
        PF = 1.2 * Basic_Salary;          // Calculate PF
        PT = 200;                         // Fixed Professional Tax
    }

    // Parameterized constructor
    public Employee(int Id, String Name, double BasicSal) {
        EmployeeId = Id;                    // Assign Employee ID
        Employee_Name = Name;               // Assign Employee Name
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
        return ("Employee Id: " + EmployeeId + "\nEmployee Name: " + Employee_Name + "\nBasic Salary: " + Basic_Salary+"\nTotal Salary: "+Total_Salary);
    }
}
