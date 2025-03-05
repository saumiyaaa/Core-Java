package com.array;

public class Array1 {
	
	int arr [] ;//= new int[] {10, 20, 30, 40, 50};
	
	public void setElements(int ... elements) {	
		
          arr = elements;
		
		for (int i = 0; i < arr.length; i++) {
			
	      
	        System.out.print(arr[i]+" ");
	    }
	}
		
	public boolean checkElements(int e) {
		
    
		    for (int x : arr) {
		        if (e == x) {
		            return true; // Return true as soon as a match is found
		        
		    }
		   
		}
		    
		    return false; // Return false if no match is found
		
	}
	
	public static void main(String [] args) {
		
		Array1 a = new Array1();
		
     a.setElements(10, 20, 30, 40, 50);
     
     System.out.println();
     
     System.out.println(a.checkElements(70));
		
	}

}
