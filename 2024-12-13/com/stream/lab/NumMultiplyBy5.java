package com.stream.lab;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NumMultiplyBy5 {
	
	public static void main(String[] args) {
		
		List <Integer> num = Arrays.asList(7,5,30,90,30,12,10);
		List <Integer> resIntegers = num.stream() 
				                        .map(n->n*5)
				                        .sorted()
				                        .collect(Collectors.toList());
		System.out.println("Numbers multiplied by 5 in ascending order: "+resIntegers);
		
		List <Integer> resIntegers2 = num.stream() 
                .map(n->n*5)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
		System.out.println("\nNumbers multiplied by 5 in descending order: "+resIntegers2);
		
	long Count = num.stream() 
				.count();
	System.out.println("\nCount: "+Count);
	
	List <Integer> uniqueIntegers = num.stream() 
            .distinct()
            .collect(Collectors.toList());
	System.out.println("\nDistinct Numbers: "+uniqueIntegers);
	
	List <Integer> Peek = num.stream() 
            .map(n->n*5)
            .peek(n->System.out.println("After Multiplied by 5: "+n))
            .collect(Collectors.toList());
	System.out.println("\n List: "+Peek);
	
	List <Integer> Limit = num.stream() 
            .map(n->n*5)
            .limit(4)
            .collect(Collectors.toList());
	System.out.println("\n Limit 4: "+Limit);
	
	List <Integer> Skip = num.stream() 
            .map(n->n*5)
            .skip(2)
            .collect(Collectors.toList());
	System.out.println("\n Skip 2: "+Skip);


	}

}
