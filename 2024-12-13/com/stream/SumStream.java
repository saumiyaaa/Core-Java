package com.stream;

import java.util.Arrays;
import java.util.List;

public class SumStream {

	public static void main(String[] args) {

		List <Integer> num = Arrays.asList(2,7,4,3,98,32,12,76,87,48,59);
		int sumOfEven = num.stream()
				.filter(n->n%2==0)
				.mapToInt(n->n.intValue())
				.sum();
		System.out.println("Sum of Even Numbers: "+sumOfEven);
		
		int sumOfOdd = num.stream()
				.filter(n->n%2!=0)
				.mapToInt(n->n.intValue())
				.sum();
		System.out.println("Sum of Odd Numbers: "+sumOfOdd);
		
		
		
		
		
				

	}

}
