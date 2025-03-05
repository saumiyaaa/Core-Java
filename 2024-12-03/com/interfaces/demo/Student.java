package com.interfaces.demo;

public class Student implements Printable{
	
	protected int studId;
	protected String name;
	protected int deptId;
	
	public Student(int id, String n, int d) {
		
		studId = id;				
		name = n;
		deptId = d;
	}
	
	public String toString() {
		
		return "Student ID: "+studId+"\nStudent Name: "+name+"\nDepartment ID: "+deptId;
	}

	@Override
	public void print() {


		System.out.println( "-----------STUDENT CLASS -----------");
		
	}
	

}
