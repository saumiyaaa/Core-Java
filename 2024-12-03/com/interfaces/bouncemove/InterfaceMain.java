package com.interfaces.bouncemove;

public class InterfaceMain {

	public static void main(String[] args) {


		Bounceable b = new Ball();
		b.bounce();
		((Ball)b).move();
		
		System.out.println("\n");
		
		Movable m = new Car();
		m.move();
	}

}
