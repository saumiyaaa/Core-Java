package com.refthis;



public class ReferenceThis {
	
	private int day, month, year;
	
	public ReferenceThis() {
		
		day = 23;
		month = 10;
		year = 2005;
		
	}
	
	/*public ReferenceThis(int day, int month, int year) {
	    day = day;       // This assigns the parameter to itself, not to the instance variable
	    month = month;   // Same issue here
	    year = year;     // And here
	}*/
	//After assigning values to itself, on completion of execution of program the memory is lost. 
	//The output 0/0/0 occurs because the constructor ReferenceThis(int day, int month, int year) 
	//does not correctly initialize the instance variables this.day, this.month, and this.year. 
	//Instead, the parameters day, month, and year are assigned to themselves, which does nothing.
	
	/*In the above code, the local variables day, month, and year (parameters of the constructor)
	 *  shadow the instance variables with the same names.
	 * The 'this' keyword is required to differentiate the instance variables from the parameters.
	 */
	
	 public ReferenceThis(int day, int month, int year) {
	        // Corrected lines
	        this.day = day;       // Assign parameter day to instance variable day
	        this.month = month;   // Assign parameter month to instance variable month
	        this.year = year;     // Assign parameter year to instance variable year
	    }

	public void printDetails() {
		System.out.print(day+"/"+month+"/"+year);
	}
}
