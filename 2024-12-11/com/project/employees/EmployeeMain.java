package com.project.employees;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;
import com.project.employees.util.*;


public class EmployeeMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		LinkedList <Employee> l = new LinkedList<>();
		
		while(true) {
			
			
			System.out.println("\nEnter name of Employee: ");
			String name = sc.nextLine();
			
			System.out.println("\nEnter Salary of Employee: ");
			double sal = sc.nextDouble();
			sc.nextLine();
			
					
			System.out.println("\n\nEnter Skills of Employee ");
			TreeSet <String> tSet = new TreeSet<>();
			
			while(true) {
				
				System.out.println("\nEnter Skill : ");
				String skill = sc.nextLine();
				tSet.add(skill);
				
				System.out.println("\nDo you want to add more skills? (0/1)");
				int m = sc.nextInt();
				sc.nextLine();
				
				if (m != 1 && m != 0) {
		             System.out.println("Invalid choice, try again.");
		             continue; // Skip to the next iteration of the loop
		         }
								
				if (m == 0) {
					
					break;
					
				}
				
			}
			
			l.add(new Employee(name, sal, tSet));
			
			System.out.println("\nDo you want to add more employees? (0/1)");
			int n = sc.nextInt();
            sc.nextLine();
            
			if (n != 1 && n != 0) {
	             System.out.println("Invalid choice, try again.");
	             continue; // Skip to the next iteration of the loop
	          }
			
			if (n == 0) {				
				break;				
			  }			
				
		}
		
		while (true) {
			
			
			System.out.println("\n1.Display List of Employees\n2.Report\n3.Sort\n4.Search by ID");
			int ch = sc.nextInt();
			sc.nextLine();
			
			if (ch < 1 || ch > 4) {
	             System.out.println("Invalid choice, try again.");
	             continue; // Skip to the next iteration of the loop
	         }
			
			switch (ch) {
			case 1: {
				UtilityList.printList(l);
				break;
			}
			case 2: {
				UtilityReport.showReport(l);
				break;
			}
			case 3: {
				
				System.out.println("\nSort by: \n1.ID\n2.Salary");
				int in = sc.nextInt();
				switch (in) {
				case 1: {
					System.out.println("\n----------Sort by ID----------\n");
					SortUtil.sortByID(l);
					UtilityList.printList(l);
					break;
				}
				case 2: {
					System.out.println("\n----------Sort by Salary----------\n");
					Collections.sort(l,new SortUtil());
					UtilityList.printList(l);
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + in);
				}
				
				break;
			}
			case 4: {
				
				 System.out.println("\nEnter Employee ID to search : ");
				   int id = sc.nextInt();
				   sc.nextLine();
				  
				try {
					SearchUtil.search(l, id);
				} catch (EmployeeRecordNotFoundException e1) {
					// TODO Auto-generated catch block
					System.err.println(e1.getMessage());;
				}
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + ch);
			}
			
			System.out.println("Do you want to continue ? (0/1)");
			int decision = sc.nextInt();
			sc.nextLine();
			
			if (decision != 1 && decision != 0) {
	             System.out.println("Invalid choice, try again.");
	             continue; // Skip to the next iteration of the loop
	         }
			
			if (decision == 0) {
				
				System.out.println("---------------Thankyou ---------------");
				break;
			}
			
		}
		
		sc.close();

	}

}
