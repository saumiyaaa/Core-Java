package com.homework;

public class armstrong {

	public static void main(String[] args) {
		int num = 153;
		int n=num, sum = 0;
		
		while(n>0) {
			int digit = n%10;
			sum+= (digit*digit*digit);
		}
		
		if(sum == num)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not Armstrong Number");
	}

}
