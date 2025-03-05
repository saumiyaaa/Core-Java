package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class RemoveDuplicateStream {
	
	public static void main(String[] args) {
		
		List <Integer> num = Arrays.asList(2,7,4,3,98,32,12,76,87,48,59,32,98,4,3);
		List <Integer> noDuplicateIntegers = num.stream()
				                            .distinct()
				                            .collect(Collectors.toList());
		System.out.println(Arrays.toString(noDuplicateIntegers.toArray()));
		
		
	}

}
