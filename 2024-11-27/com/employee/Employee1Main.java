package com.employee;

public class Employee1Main {
	
	public static void main(String[] args) {
		
		Employee1 em = new Employee1();
				
				em.printEmployee();
				System.out.println();
				
				
				Employee1 ep = new Employee1("Saumiya",863792,5674.2);
				ep.printEmployee();
				System.out.println();
				
				Employee1 ep1 = new Employee1("Anna",693657,6589);
				ep1.printEmployee();
				System.out.println();
				
				Employee1.totalEmployees();

			}


}
