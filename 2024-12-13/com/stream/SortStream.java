package com.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortStream {
	
	public static void main(String[] args) {
		
		List <String> days = Arrays.asList("MoNdAy", "tUesDay", "FrIDAY", "saturDAY", "SUndAY", "tHURsdaY", "wedNEsDaY");
		List <String> ascendingString = days.stream()
				.map(s->s.toLowerCase())
				.sorted()
				.collect(Collectors.toList());
		System.out.println("ASCENDING ORDER: "+ascendingString);
		
		List <String> descendingString = days.stream()
				.map(s->s.toLowerCase())
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		System.out.println("\nDESCENDING ORDER: "+descendingString);
	}

}
