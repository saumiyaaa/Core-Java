package com.moverloading.math;

public class MathClassMain {

	public static void main(String[] args) {
		
		MathClass m = new MathClass();
		m.add(5, 70);
		m.add(25.5f, 30.5f);
		m.add("Hello", "World");
		m.add(3, 4, 5);
		m.add(5, 4, 3.5f);

	}

}
