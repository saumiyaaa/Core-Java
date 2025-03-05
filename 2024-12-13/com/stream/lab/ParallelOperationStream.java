package com.stream.lab;

import java.util.stream.Stream;

public class ParallelOperationStream {
	
	public static void main(String[] args) {
		

                 Stream.of("MoNdAy", "tUesDay", "FrIDAY", "saturDAY", "SUndAY", "tHURsdaY", "wedNEsDaY")
                .parallel()
				.map(s->s.toUpperCase())
			    .sorted()
				.forEach(x->System.out.println("Value: "+x));
                 System.out.println();
                 
                 Stream.of("MoNdAy", "tUesDay", "FrIDAY", "saturDAY", "SUndAY", "tHURsdaY", "wedNEsDaY")
                 .parallel()
 				.map(s->s.toUpperCase())
 			    .sorted()
 				.forEachOrdered(x->System.out.println("Value: "+x));
	}

}
