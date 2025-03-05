package com.array;

public class Array3 {
	
	private int arr[];
	private int max, min;
	
	
	public void setElements(int ...elements) {
		
		arr = elements;
		
		for(int x : arr) {
			
			System.out.print(x+" ");
		}
		
	}
	

	
	public void maxElement() {
		
		max = arr[0];
		
            for(int x : arr) {
            	
            	if(x > max) {
            		
            		max = x;
            		
            	}
            	
         }	
			
			System.out.print(max);			
	}
		
	
	
    public void minElement() {
    	
    	min = arr[0];
   
    	 for(int x : arr) {
         	
         	if(x < min) {
         		
         		min = x;
         		
         	}
    	
    	}
			
			System.out.print(min);
	}
		
	

	public static void main(String[] args) {
		
		Array3 a = new Array3();
		
		System.out.print("ELEMENTS OF ARRAY: ");
		a.setElements(10, 20, 30, 40, 50);
		
		System.out.println("\n");
		
		System.out.print("MAX ELEMENT: ");
		a.maxElement();
		
        System.out.println("\n");
		
		System.out.print("MIN ELEMENT: ");
		a.minElement();
		
		

	}

}
