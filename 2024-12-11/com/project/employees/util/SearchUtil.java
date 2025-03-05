package com.project.employees.util;

import java.util.LinkedList;
import com.project.employees.Employee;
import com.project.employees.EmployeeRecordNotFoundException;

public class SearchUtil {
	
	public static void search(LinkedList <Employee> l, int id) throws EmployeeRecordNotFoundException{		

	   
	   boolean flag = false;
	   
	   for (Object obj : l) {
	
		   Employee e = (Employee)obj;
		   
		   if (id == e.empid) {
			   
			   flag = true;
			   System.out.println("Employee ID "+id+" Found: "+e);
			   break;	
		}
		  
		
	    }
	   
	   if (flag == false) {
		   
		    throw new EmployeeRecordNotFoundException("Employee doesn't exist !!!");
						
		}
		
	}

}
