package com.innerclass.simple;

//import com.innerclass.simple.Account.Locker;

public class AccountMain {

	public static void main(String[] args) {
		
		//METHOD 1 USING FULLY QUALIFIED NAME INSTEAD OF IMPORT
		
		Account a = new Account();
		Account.Locker locker = a.new Locker();
		
		// USING IMPORT TO IMPORT LOCKER CLASS FROM ACCOUNT CLASS
		
		/* METHOD 2 USING IMPORT
		 * Account a = new Account();
		 * Locker l = new Locker();
		 * 
		 * a.print();
		 * l.print();
		 */
		
		/* METHOD 3 USING IMPORT
		 * Locker l = new Account().new Locker();
		 */
		
		locker.print();		

	}

}
