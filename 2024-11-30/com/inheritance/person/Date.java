package com.inheritance.person;

public class Date {
	


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
		
		public static void swapDate(Date d[]) {
			Date temp;
			temp=d[0];
			d[0]=d[1];
			d[1]=temp;
		}
		
		
		
		public static void main(String[] args) {
			
			Date darr[]=new Date[2];
			
			darr[0]= new Date(10,10,2010);
			darr[1]= new Date(11,11,2012);
			
			//Date d1 = new Date(10,10,2010);
			//Date d2 = new Date(11,11,20102);
			
			System.out.println("Before swap : "+darr[0]+" "+darr[1]);
			
			//System.out.println("Before swap : "+d1+" "+d2);
			
			Date.swapDate(darr);
			
			//Date.swapDate(d1,d2);
			
			System.out.println("A swap : "+darr[0]+" "+darr[1]);
			
			//System.out.println("After swap : "+d1+" "+d2);
			

	}
	}


