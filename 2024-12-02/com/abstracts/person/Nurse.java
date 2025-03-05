package com.abstracts.person;

public class Nurse extends Person{
	
	int hrsWorked;
	String shift;
	double hrRate;
	
	public Nurse(String n, int hW, String s, double hR) {
	
		super(n);
        hrsWorked = hW;
        shift = s;
        hrRate = hR;
	
	}
	
	public void calculatePayment() {
		
		System.out.println("Salary (in Rs): "+hrsWorked*hrRate+" per week");		
		
	}
	
    public void displayDetails(){
		
		System.out.println("Name: "+name+"\nHours Worked: "+hrsWorked+"\nShift: "+shift+"\nHourly Rate (in Rs): "+hrRate);
	}

}
