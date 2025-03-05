package com.project.employees;

@SuppressWarnings("serial")
public class EmployeeRecordNotFoundException extends Exception{
	
	String msg;
	
	public EmployeeRecordNotFoundException() {
		msg = "Error !";
	}
	
	public EmployeeRecordNotFoundException(String m) {
		
		super(m);
		msg = m;
	}

}
