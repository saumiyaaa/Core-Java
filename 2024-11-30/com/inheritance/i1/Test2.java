package com.inheritance.i1;
import com.inheritance.employee.*;

/*import inheritanceEmployee.Developer;
import inheritanceEmployee.Employee;
import inheritanceEmployee.Manager;
import inheritanceEmployee.SalesPerson;*/


//Test class to demonstrate polymorphism, instanceof, and downcasting
public class Test2 {
 
 // Method to calculate and display details of an Employee object
 public static void calc(Employee e) {
     
     // Polymorphism: The method accepts any Employee type (base class or derived classes)
     System.out.println(e); // Calls the appropriate toString() method based on the runtime type
     System.out.println("Salary: " + e.SalCalc()); // Calls the base class method

     // Using instanceof to check if the object is of type SalesPerson
     if (e instanceof SalesPerson) {
         // Downcasting: Converts the Employee reference to a SalesPerson reference
         // WHY instanceof?
         // Before downcasting, we must ensure that the object is actually of the desired type.
         // This prevents a runtime ClassCastException if the object is not of the type we expect.
         
         SalesPerson s = (SalesPerson) e;

         // WHY downcasting?
         // To access methods or fields that are specific to the SalesPerson class
         // (e.g., calcCommPCT()), which are not available in the Employee class.
         System.out.println("Commission Percentage: " + s.calcCommPCT()); // Call method specific to SalesPerson
     }

     // Using instanceof to check if the object is of type Manager
     if (e instanceof Manager) {
         // Downcasting: Converts the Employee reference to a Manager reference
         // WHY instanceof?
         // Ensures type safety by verifying that the object is an instance of Manager
         // before attempting to access Manager-specific functionality.

         Manager m = (Manager) e;

         // WHY downcasting?
         // Manager has its own specific method (InctCalc) which calculates incentives.
         // These methods are not part of the Employee class, so we must downcast
         // the reference to use them.
         System.out.println("Incentives: " + m.InctCalc()); // Call method specific to Manager
     }
 }
 
 public static void main(String args[]) {
     // Menu display
     System.out.println("1.Developer\n2.SalesPerson\n3.Manager\n\n");
     System.out.println("Enter Choice: \n");
     
     int choice = 1; // Replace this with user input for dynamic behavior
     
     // Using switch to handle different types of employees
     switch (choice) {
         case 1: 
             // Passing a Developer object
             Test2.calc(new Developer());
             break;
         
         case 2: 
             // Passing a SalesPerson object
             Test2.calc(new SalesPerson());
             break;
         
         case 3: 
             // Passing a Manager object
             Test2.calc(new Manager());
             break;
         
         default:
             // Handle invalid choice
             System.out.println("ENTER CORRECT CHOICE !");
     }
  }
 
}