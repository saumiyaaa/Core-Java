package com.innerclass.anonymous;

interface I3{
	
	public int length(String s);
}

public class StringLength {
	
	public static void main(String[] args) {
		
		I3 i3;
		
		i3 = (String s) -> {
			return s.length();
		};
		
				
		int len = i3.length("Sam");
		System.out.println(len);
		
	}

}
