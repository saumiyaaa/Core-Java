package com.project.employees.util;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

import com.project.employees.Employee;

public class SortUtil implements Comparator<Employee>{

	 // Method to sort the LinkedList of Employee objects by empid in descending order
	
    public static void sortByID(LinkedList<Employee> list) {
    	
    	        Collections.sort(list, (e1, e2) -> {
    	            if (e1.empid < e2.empid) 
    	                return 1;
    	            else if (e1.empid > e2.empid) 
    	                return -1;
    	            else 
    	                return 0;
    	        });
       
    }
    
  // USING ANONYMOUS INNER 
       // Method to sort the LinkedList of Employee objects by empid in descending order
      //  }
    
	 
    /* public static void sortByID(LinkedList<Employee> list) {
    Collections.sort(list, new Comparator<Employee>() {
	
    @Override
    public int compare(Employee e1, Employee e2) {
    	
		if(e1.empid<e2.empid)                    // descending order
			return 1;
		else if(e1.sal>e2.sal)
			return -1;
		else 
			return 0;
	}

	}); */
			

    // Method to sort the LinkedList of Employee objects by salary in ascending order
    
            @Override
            
            public int compare(Employee o1, Employee o2) {
            	
            	Employee e1 = (Employee)o1;
        		Employee e2 = (Employee)o2;
        		if(e1.sal<e2.sal)
        			return -1;
        		else if(e1.sal>e2.sal)
        			return 1;
        		else 
        			return 0;
        	}	
       
    }
        

	
