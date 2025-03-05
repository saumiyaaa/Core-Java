package com.innerclass.anonymous;

interface I4{
	
	public int calcMax(int x, int y );
}

public class MaxNum {

	public static void main(String[] args) {

		I4 i4;
		
		i4 = (x,y) -> {
			return ( x>y ? x:y );
		};
		
		int max = i4.calcMax(6, 9);
		System.out.println("Max Number is: "+max);

	}

}
