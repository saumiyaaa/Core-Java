package com.array;

public class Array2 {
	
    private int arr [] ;//= new int[] {10, 20, 30, 40, 50};
	
	public void setElements(int ... elements) {	
		
          arr = elements;
		
		for (int i = 0; i < arr.length; i++) {
			
	      
	        System.out.print(arr[i]+" ");
	    }
	}
	
	int count = 0;
	
	public void removeElement(int e) {		
		
		
		for(int x : arr) {
			
			if(x != e) {
				
			 count++;			
				
			}
		}
		
		int arr1 [] = new int[count];
		
		int index=0;
		
          for(int x : arr) {
			
			if(x != e) {
				
			 arr1[index++] = x;			
				
			}
		}
		
          for (int i = 0; i < arr1.length; i++) {
  			
    	      
  	        System.out.print(arr1[i]+" ");
  	    }
	}

	public static void main(String[] args) {
		
		Array2 a = new Array2();
		
		System.out.println("ARRAY BEFORE REMOVING ELEMENT\n");
		a.setElements(10, 20, 30, 40, 50);
		System.out.println("\n");
		System.out.println("ARRAY AFTER REMOVING ELEMENT\n");
		a.removeElement(20);
		

	}

}
