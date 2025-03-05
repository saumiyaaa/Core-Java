package com.project.employees;

import java.util.TreeSet;

public class Employee {
	
	public int empid;
	public String name;
	public double sal;
	TreeSet <String> skillsets;
	private static int count;
	
	static {
		count = 0;
	}
	
	public Employee() {
		
		empid = ++count;
		name = "Sam";
		sal = 950000.0;
		skillsets = new TreeSet<>();

	}
	
	public Employee(String n, double sal, TreeSet<String> t) {
		
		empid = ++count;
		name = n;
		this.sal = sal;
		skillsets = t;
	}
	
	
	/*@Override
	public int compareTo(Object o) {
		
		Employee e = (Employee)o;
		if(this.empid<e.empid)         //Descending Order
			return 1;
		else if(this.empid>e.empid)
			return -1;
		else 
			return 0;
	}*/
	

	
	@Override
	public String toString() {
		
		return "\n\nEmployee ID: "+empid+"\nName: "+name+"\nSalary: "+sal+"\nSkills : "+skillsets;
	}

}
