package com.interfaces.bouncemove;

public class Ball implements Bounceable, Movable{
	
	public void bounce() {
		
		System.out.print("A ball bounces");
		
	}

	@Override
	public void move() {

		System.out.print(" and it moves.");
				
	}

}
