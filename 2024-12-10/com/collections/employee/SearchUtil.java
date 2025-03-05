package com.collections.employee;

import java.util.LinkedList;
import java.util.Scanner;

public class SearchUtil {
	
	public static void search(LinkedList<Employee> l, Scanner sc) {
		
		//Scanner sc = new Scanner(System.in);
		
	System.out.println("Enter the Employee ID to serach ");
	int id = sc.nextInt();
	
	boolean flag = false;
		
		for(Object x: l) {
			
			Employee e = (Employee) x;
			if (id == e.empid) {
				flag = true;
				System.out.println("Employee ID "+id+" Found: "+e);
				break;				
			}
						
		}
		
		if (flag == false) {
			System.out.println("\nStudent not Found\n");				
		}
		
		
	}
	

}
