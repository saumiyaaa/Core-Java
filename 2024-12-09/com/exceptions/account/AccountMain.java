package com.exceptions.account;

public class AccountMain {

	public static void main(String[] args) {

       Account a1 = new Account ();
       
      try {
		//a1.withdraw(9500);
    	  a1.withdraw(9000);
		System.out.println(a1);
	} catch (insufficientBalanceException e) {
		//e.printStackTrace();
		System.err.println(e.getMsg());
		//System.err.println(e.getMessage());
	}

}
}
