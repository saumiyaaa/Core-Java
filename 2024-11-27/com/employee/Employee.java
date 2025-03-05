package com.employee;

// Class representing an Employee
public class Employee {
    
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
    public Employee() {
        // Initialize with default values
        EmployeeId = 12345;                 // Default Employee ID
        Employee_Name = "SAM";              // Default Employee Name
        Basic_Salary = 1000000.00;          // Default Basic Salary
        Medical = 300000;                   // Default Medical Allowance
    }

    // Parameterized constructor
    public Employee(int Id, String Name, double BasicSal, double Med) {
        EmployeeId = Id;                    // Assign Employee ID
        Employee_Name = Name;               // Assign Employee Name
        Basic_Salary = BasicSal;            // Assign Basic Salary
        Medical = Med;                      // Assign Medical Allowance
    }

    // Using Getter and Setter methods for salary calculations (commented out)
    /*
    public double getGrossSalCalc() {
        return Gross_Salary;
    }

    public void setGrossSalCalc() {        
        Gross_Salary = Basic_Salary + HRA + Medical;        
    }
    */

    // Method to calculate Gross Salary
    public double GrossSalcalc() {
        // Formula: Gross Salary = Basic Salary + HRA + Medical
        Gross_Salary = Basic_Salary + HRA + Medical;  
        return Gross_Salary;                         
    }

    // Using Getter and Setter methods for Net Salary calculations (commented out)
    /*
    public double getNetSalCalc() {
        return Net_Salary;        
    } 
    
    public void setNetSalCalc() {
        Net_Salary = Gross_Salary - (PF + PT);
    }
    */

    // Method to calculate Net Salary
    public double NetSalcalc() {
        // Formula: Net Salary = Gross Salary - (PF + PT)
        Net_Salary = Gross_Salary - (PF + PT);
        return Net_Salary;
    }

    // Method to print Employee details
    public void printDetails() {
        GrossSalcalc();  // Automatically calculate Gross Salary
        NetSalcalc();    // Automatically calculate Net Salary
        System.out.println("Employee Id: " + EmployeeId);
        System.out.println("Employee Name: " + Employee_Name);
        System.out.println("Basic Salary: " + Basic_Salary);
        System.out.println("Gross Salary: " + Gross_Salary);
        System.out.println("Net Salary: " + Net_Salary);
    }
}
