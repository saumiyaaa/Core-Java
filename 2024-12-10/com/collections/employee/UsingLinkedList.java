package com.collections.employee;

import java.util.LinkedList;
import java.util.Collections;
import java.util.Scanner;

public class UsingLinkedList {
	
	
	public static void display(LinkedList<Employee> l) {
		
		for(Object x: l) {
			System.out.println(x);
		}
	}

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		LinkedList<Employee> l = new LinkedList<>();
		
		l.add(new Employee());
		l.add(new Employee("Tom Marvolo Riddle", 1200000.0));
		l.add(new Employee("Sirius Black", 200000.0));
		l.add(new Employee("Albus Dumbledore", 3200000.0));
		l.add(new Employee("Harry Potter", 8200000.0));
		l.add(new Employee("Hermione Granger", 5400000.0));
		l.add(new Employee("Ron Weasely", 6500000.0));
		
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
					display(l);			
			break;
		}
		case 2: {
			System.out.println("----------Search for the employee----------");
			       SearchUtil.search(l,sc);			        
			break;
		}
		case 3: {
			System.out.println("Sort by: \n1.ID\n2.Name\n3.Salary");
			int ch = sc.nextInt();
			sc.nextLine();
			switch (ch) {
			
			case 1: {				
				System.out.println("----------Sorting employees in descending order----------");
			       Collections.sort(l);
			break;
			      }
				
			case 2: {
				System.out.println("----------Sorting employees in alphabetical order----------");
				       Collections.sort(l,new CompareByName());
				break;
			}
			

			case 3: {
				System.out.println("----------Sorting employees by Salary----------");
				       Collections.sort(l, new CompareBySalary());
				break;
			}
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + ch);
			}
			break;
		}

		case 4: {
			System.out.println("----------Adding employee----------");
		       AddUtil.add(l,sc);
		       //System.out.println(a);
		break;
	   }
		case 5: {
			System.out.println("----------Removing employee----------");
			RemoveUtil.remove(l,sc);
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


