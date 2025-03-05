package com.map;

import java.util.TreeMap;


public class DemoTreeMap {
	
	public static void main(String[] args) {
		
				//duplicate key - not allowed
						//duplicate value - allowed
						//null key - no
						//null value - yes
						//unordered
						//sorted by key				
						
						TreeMap<Integer,String> h1 = new TreeMap<>();
						
						h1.put(90, "bbb");
						h1.put(14, "aaa");
						h1.put(16, "uuu");
						h1.put(51, "www");
						h1.put(7, "rrr");
						h1.put(12, "aaa");
						h1.put(6, null);
						//h1.put(null, "rtd");
						
						System.out.println(h1);
						
						h1.remove(51);
						System.out.println(h1);
					

	}

}
