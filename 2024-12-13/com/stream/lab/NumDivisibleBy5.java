package com.stream.lab;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumDivisibleBy5 {
	
	public static void main(String[] args) {
		
		List <Integer> num = Arrays.asList(7,5,3,90,32,12,10);
		List <Integer> resIntegers = num.stream() 
				                        .filter(n->n%5==0)
				                        .collect(Collectors.toList());
		System.out.println("Numbers divisible by 5 are: "+resIntegers);
		
	}

}
