package com.interfaces.sports;

public class InterfaceMain {
	
	public static void sports(Playable p) {
		
		p.play();
		System.out.println("\n");
	}
	
	public static void main(String [] args) {
		
		sports(new Football());
		sports(new Volleyball());
		sports(new Basketball());
		
	}

}
