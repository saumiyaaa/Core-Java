package com.main;

import com.bank.ATM;
import com.finance.Account;

public class BankMain2 {

	public static void main(String[] args) {
		
		//By using import to access classes of that package
		
		
		Account a1 = new Account();
		System.out.println(a1.print());
		
		ATM a3 = new ATM();
		System.out.println(a3.print());
		
		System.out.println();
		
		Account a2 = new Account(67891, "Grace");
		System.out.println(a2.print());	

		
		ATM a4 = new ATM(30000);
		System.out.println(a4.print());


	}

}
