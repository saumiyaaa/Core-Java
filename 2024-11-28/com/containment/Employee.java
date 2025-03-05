package com.containment;

public class Employee {
	
		
		private int empid;
		private String name;
		private double salary;
		private Date doj;
		
		public Employee() {
			empid=34;
			name="Payel";
			salary=879435;
			doj = new Date();
		}
		
		public Employee(int i, String n, double s, Date d) {
			empid = i;
			name = n;
			salary = s;
			doj = d;
		}
		
		@Override
		public String toString() {
			return ("Employee Id: "+empid+"\nEmployee Name: "+name+"\nSalary: "+salary+"\nDate: "+doj);
		}
		//toString should be present in date class or reference will be shown not value.
		

		public static void main(String[] args) {
			Employee e1 = new Employee();
			System.out.println(e1);
			
			System.out.println();
			
			Employee e2 = new Employee(66,"Abel", 2349000,new Date(6,7,2013));
			System.out.println(e2);

		}

	}


