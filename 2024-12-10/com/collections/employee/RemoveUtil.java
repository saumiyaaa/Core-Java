package com.collections.employee;

import java.util.LinkedList;
import java.util.Scanner;

public class RemoveUtil {
	
	//static Scanner sc = new Scanner(System.in);
 
	
	public static void remove(LinkedList<Employee> l, Scanner sc) {
			
	
		System.out.println("\n\nEnter the ID of Employee you want to remove");
		int id = sc.nextInt();
		boolean flag = false;
		
		for(int i = 0; i<l.size(); i++) {
			
			Employee e = (Employee) l.get(i);
			if (id == e.empid) {
				flag = true;
				l.remove(i);
				System.out.println("Employee with ID " + id + " has been removed.");
				break;				
			}		
			
		}
		
		 if (!flag) {
		        System.out.println("\nEmployee with ID " + id + " not found.\n");
		        
		        
		 }
		 
		}
	
}
