package com.stream;

import java.util.Arrays;

import java.util.List;
import java.util.stream.Collectors;

public class StringStream {
	
	public static void main(String[] args) {
		
		List <String> days = Arrays.asList("MoNdAy", "tUesDay", "FrIDAY", "saturDAY", "SUndAY", "tHURsdaY", "wedNEsDaY");
		
		List <String> uppercaseString = days.stream()
				.map(s->s.toUpperCase())
				.collect(Collectors.toList());
		
		System.out.println("UPPERCASE STRING: "+uppercaseString);
		System.out.println();
		
		List <String> lowercaseString = days.stream()
				.map(s->s.toLowerCase())
				.collect(Collectors.toList());
		
		System.out.println("\nlowercase string: "+lowercaseString);
		System.out.println();
	}

}
