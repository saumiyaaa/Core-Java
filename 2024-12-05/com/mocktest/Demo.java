package com.mocktest;

public class Demo {
	
	public static void main(String[] args) {
		
		int a[][] = {{1, 2, 3}, {4, 5, 6}};
		int x = 0;
		
		for (int j = 0; j < a.length; j++) {
			
			for (int k = 0; k < a[0].length; k++) {
				
				if (k == 0) {
					// Add 2 to the first element of each row
					a[j][k] += 2;
				}
				
				// Add all elements to x
				x += a[j][k];
			}
		}
		System.out.println(x);
	}

}
