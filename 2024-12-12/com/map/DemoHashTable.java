package com.map;

import java.util.Hashtable;

public class DemoHashTable {
	
		public static void main(String[] args) {
			//duplicate key - not allowed
			//duplicate value - allowed
			//null key - no
			//null value - no
			//unordered
			//unsorted
			//thread safe
			//legacy class
			
			Hashtable<Integer,String> h1 = new Hashtable<>();
			
			h1.put(90, "bbb");
			h1.put(14, "aaa");
			h1.put(16, "uuu");
			h1.put(51, "www");
			h1.put(7, "rrr");
			h1.put(12, "aaa");
			System.out.println(h1);
			
			h1.remove(51);
			System.out.println(h1);
			
			System.out.println(h1.get(7));
			System.out.println(h1.keySet());
			System.out.println(h1.values());
	}

}
