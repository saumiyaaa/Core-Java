package com.main;

public class BankMain1 {
	
	public static void main(String [] args) {
		
		//Using fully qualified name and not using import
		
		com.finance.Account a1 = new com.finance.Account();
		System.out.println(a1.print());
		
		com.bank.ATM a3 = new com.bank.ATM();
		System.out.println(a3.print());
		
		System.out.println();
		
		com.finance.Account a2 = new com.finance.Account(67891, "Grace");
		System.out.println(a2.print());		
		

		com.bank.ATM a4 = new com.bank.ATM(30000);
		System.out.println(a4.print());


		
	}

}
