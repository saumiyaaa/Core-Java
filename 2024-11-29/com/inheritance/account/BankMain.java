package com.inheritance.account;

public class BankMain {

	public static void main(String[] args) {
		
		SavingAccount s1 = new SavingAccount();
		System.out.println(s1.print());
		
		System.out.println();
		
		SavingAccount s2 = new SavingAccount(45673, "Rachel", 5000, 30, 100000 );
		System.out.println(s2.print());
		
		System.out.println();
		
		FixedDepositAccount fd1 = new FixedDepositAccount();
		System.out.println(fd1.print());
		
		System.out.println();
		
		FixedDepositAccount fd2 = new FixedDepositAccount(45673, "Rachel", 1, "25/8/2025", 0.2, 60000);
		System.out.println(fd2.print());
		
		

	}

}
