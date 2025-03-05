package com.project.employees.util;

import java.util.LinkedList;

import com.project.employees.Employee;

public class UtilityReport {
	
	public static void showReport(LinkedList<Employee> l) {
		
		System.out.println("\n------Report------\n");
		
		for(Object x: l) {
			
			Employee e = (Employee)x;
			System.out.println("\n"+e.name+" ---> "+e.sal+"\n\n") ;
		}
		
			
	}

}
