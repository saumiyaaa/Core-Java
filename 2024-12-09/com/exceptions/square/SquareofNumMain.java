package com.exceptions.square;

import java.util.Scanner;

public class SquareofNumMain {

	public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter a number ");
       int n = sc.nextInt();
       sc.nextLine();
       
       SquareofNum sq = new SquareofNum(n);
       
       try {
    	   
    	   sq.getSquare();
		
	} catch (Exception e) {
		System.err.println(e.getMessage());
	}
       
       sc.close();

	}

}
