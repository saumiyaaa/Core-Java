package com.interfaces.demo;

public class Date implements Printable{
	


	private int day, month, year;
		
		public Date() { 
			day = 10; 
			month = 10; 
			year = 2010;
		}

		
		public Date(int day, int month, int year) {
			
			this(day); 
			this.month = month;
			this.year = year;
			
		}
			
		public Date(int day) {
			this.day = day;
		}
		
		
		public String toString() {
			return(day + "/" + month + "/" + year);
		}
		
	public void print() {
		
		System.out.println("This is class Date");
	}
	}


