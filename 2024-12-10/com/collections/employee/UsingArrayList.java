package com.collections.employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class UsingArrayList {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void display(ArrayList<Employee> a) {
		
		for(Object x: a) {
			System.out.println(x);
		}
	}
	
	public static void search(ArrayList<Employee> a) {
	
	System.out.println("Enter the Employee ID to serach ");
	int id = sc.nextInt();
	
	boolean flag = false;
		
		for(Object x: a) {
			
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
	
	public static void add(ArrayList<Employee> a) {
		
		System.out.println("\n\nEnter the elements to add as follows ");
		System.out.println("\nEnter Name ");
		String n = sc.nextLine();
		System.out.println("Enter Salary ");
		double sal = sc.nextDouble();
		sc.nextLine();
		//System.out.println("Enter the position ");
		//int pos = sc.nextInt();
		
		a.add(new Employee(n, sal));
		
	}
	
	public static void remove(ArrayList<Employee> a) {
		System.out.println("\n\nEnter the ID of Employee you want to remove");
		int id = sc.nextInt();
		boolean flag = false;
		
		for(int i = 0; i<a.size(); i++) {
			
			Employee e = (Employee) a.get(i);
			if (id == e.empid) {
				flag = true;
				a.remove(i);
				System.out.println("Employee with ID " + id + " has been removed.");
				break;				
			}		
			
		}
		
		 if (!flag) {
		        System.out.println("\nEmployee with ID " + id + " not found.\n");
		 }
	}
	
	public static void main(String[] args) {
		
		ArrayList<Employee> a = new ArrayList<>();
		
		a.add(new Employee());
		a.add(new Employee("Tom Marvolo Riddle", 1200000.0));
		a.add(new Employee("Sirius Black", 200000.0));
		a.add(new Employee("Albus Dumbledore", 3200000.0));
		a.add(new Employee("Harry Potter", 8200000.0));
		a.add(new Employee("Hermione Granger", 5400000.0));
		a.add(new Employee("Ron Weasely", 6500000.0));
		
		while(true) {
		System.out.println("----------WELCOME TO HOGWARTS----------");
		System.out.println("Enter Your Choice ");
		System.out.println("1.Display\n2.Search\n3.Sort\n4.Add\n5.Remove");
		int choice = sc.nextInt();
		sc.nextLine();
		
		 if (choice < 1 || choice > 5) {
             System.out.println("Invalid choice, try again.");
             continue; // Skip to the next iteration of the loop
         }
		
		switch (choice) {
		case 1: {
					System.out.println("----------Displaying the details of employees----------");
					display(a);			
			break;
		}
		case 2: {
			System.out.println("----------Search for the employee----------");
			       search(a);			        
			break;
		}
		case 3: {
			       Collections.sort(a);
			       display(a);
			break;
		}
		case 4: {
			System.out.println("----------Adding employee----------");
		       add(a);
		       //System.out.println(a);
		break;
	   }
		case 5: {
			System.out.println("----------Removing employee----------");
			remove(a);
		   // System.out.println("Updated Employee List:");
		    //display(a);
		
		       
		break;
	}
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}
		
		System.out.println("Do you want to continue? (0/1)");
		int n = sc.nextInt();
		if (n == 0) {
			
			System.out.println("\n----------Thankyou----------");
			break;
		}
	}
		
		sc.close();
		
	}	


}
