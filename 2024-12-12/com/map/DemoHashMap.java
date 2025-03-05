package com.map;

import java.util.HashMap;


public class DemoHashMap {
	
	public static void main(String[] args) {
		
		//duplicate key - not allowed
		//duplicate value - allowed
		//null key - yes
		//null value - yes
		//unordered
		//unsorted
		
		HashMap<Integer,String> m1 = new HashMap<>();
		
		m1.put(null, "bbb");
		m1.put(54, "bbb");
		m1.put(89, "bbb");
		m1.put(54, "bbb");
		m1.put(23, "bbb");
		m1.put(90, "bbb");
		System.out.println(m1);
		
		m1.remove(54);
		System.out.println(m1);
		
		System.out.println(m1.size());
		
		System.out.println(m1.values());
		
		System.out.println(m1.get(23));
		
		System.out.println(m1.keySet());
		
	
	}

}
