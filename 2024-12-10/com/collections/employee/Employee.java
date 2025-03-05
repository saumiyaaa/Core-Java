package com.collections.employee;

public class Employee implements Comparable<Employee>{
	
	public int empid;
	String name;
	public double sal;
	private static int count;
	
	static {
		count = 0;
	}
	
	public Employee() {
		
		empid = ++count;
		name = "Sam";
		sal = 950000.0;

	}
	
	public Employee(String n, double sal) {
		
		empid = ++count;
		name = n;
		this.sal = sal;
	}
	
	@Override
	public int compareTo(Employee e) {
		
		if(this.empid<e.empid)         //Descending Order
			return 1;
		else if(this.empid>e.empid)
			return -1;
		else 
			return 0;
	}
	
	/*
	  public int compareTo1(Object o) {
		  
		  Employee e = (Employee)o;
	        return this.empid - e.empid; // Sort by roll number in ascending order
	    }
	*/
	
	@Override
	public String toString() {
		
		return "\n\nEmployee ID: "+empid+"\nName: "+name+"\nSalary: "+sal+"\n\n";
	}

}
