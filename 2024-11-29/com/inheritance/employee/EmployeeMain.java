package com.inheritance.employee;

// Main class to demonstrate inheritance
public class EmployeeMain {

    public static void main(String[] args) {
    	
    	System.out.println("--------DEVELOPER--------\n");
        
        // Creating a Developer object using the default constructor
        Developer d1 = new Developer();
        d1.SalCalc();
        System.out.println(d1); // Calls Developer's toString()     

        System.out.println("\n");

        // Creating a Developer object using the parameterized constructor
        Developer d2 = new Developer(112, "Abel", 200000, 1, 10000);
        d2.SalCalc();
        System.out.println(d2); // Calls Developer's toString()
       
        System.out.println("\n");
        
        System.out.println("--------MANAGER--------\n");
        
        Manager m1 = new Manager();
        m1.SalCalc();
        System.out.println(m1);
        
        System.out.println("\n");
        
        Manager m2 = new Manager(132, "Taylor", 500000, 4, 15000);
        m2.SalCalc();
        System.out.println(m2);
        
        System.out.println("\n");
        
        System.out.println("--------SALESPERSON--------\n");
        
        SalesPerson s1 = new SalesPerson();
        s1.SalCalc();
        System.out.println(s1);
        
        System.out.println("\n");
        
        SalesPerson s2 = new SalesPerson(132, "Taylor", 500000, 0.4, 150);
        s2.SalCalc();
        System.out.println(s2);       
        
        
    }
}
