package com.project.employees.util;


import java.util.LinkedList;


import com.project.employees.Employee;

public class UtilityList {
	
	public static void printList(LinkedList<Employee> l) {
		
		System.out.println("\n------Displaying List of All Employees------\n");
		
		for(Object x: l) {
			System.out.println(x);
		}

		
	}

}
