package com.employee;

public class Employee1 {
	
		
		private int employeeId;
		private String employeeName;
		private double basicSalary ;
		private double hra;
		private double medical ;
		private double pf;
		private double pt;
		private double netSalary;
		private double grossSalary;
		public static int count=0; 
		
		static {
			count = 0;
		}
		
		public double calcGrossSalary() {
			
			grossSalary = basicSalary+hra+medical;
			return grossSalary;
		}
		
		public double calcNetSalary() {
			
			netSalary = grossSalary-(pt+pf);
			return netSalary;
		}
		
		
		public Employee1() {
			
			employeeId=++count;			
			employeeName="Payel";
			basicSalary=763457;
			medical=4356.6;
			hra=(0.5*basicSalary);
			pf=(0.12*basicSalary);
			pt=200;
			
			
		}
		
		public Employee1(String n,double s,double m ) {
			employeeId=++count;
			employeeName= n;
			basicSalary=s;
			medical=m;
			hra=(0.5*basicSalary);
			pf=(0.12*basicSalary);
			pt=200;
			
		}
		
		public void printEmployee() {
			calcGrossSalary();
			calcNetSalary();
			System.out.println("Employee Id : "+ employeeId);
			System.out.println("Employee Name : "+ employeeName);
			System.out.println("Basic Salary : "+ basicSalary);
			System.out.println("Medical : "+ medical);
			System.out.println("Net Salary : "+ netSalary);
			System.out.println("Gross Salary : "+ grossSalary);
			
		}
		
		public static void totalEmployees() {
	        System.out.println("Total number of employees: " + count);
	    }

	}


