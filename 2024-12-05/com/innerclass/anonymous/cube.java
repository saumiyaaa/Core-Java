package com.innerclass.anonymous;

interface I2 {
	
	public void show(int n);
}

public class cube {
	
	public static void main(String[] args) {
		
		I2 i;
		
		i = n ->System.out.println(n*n*n); 
		
		i.show(3);
	}

}
