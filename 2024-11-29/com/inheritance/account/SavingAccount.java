package com.inheritance.account;

public class SavingAccount extends Account{

	protected double minimumBalance;
	protected double monthlyFee;
	protected int withdrawalLimit;
	
	public SavingAccount() {
		
		super();
		minimumBalance = 5000;
		monthlyFee = 50;
		withdrawalLimit = 300000;
	}
	
    public SavingAccount(int no, String n, double bal, double fee, int limit) {
    	
    	super(no,n);
    	minimumBalance = bal;
		monthlyFee = fee;
		withdrawalLimit = limit;
		
	}
    
   /* public String toString() {
    	
    	return super.toString()+"\nAccount Type: Saving Account"+"\nMinimum Balance: "+minimumBalance+" Rs"+"\nMonthlyFee: "+monthlyFee+" Rs"+"\nWithdrawal Limit: "+withdrawalLimit+" Rs";
    }*/
    
        public String print() {
    	
        	return super.toString()+"\nAccount Type: Saving Account"+"\nMinimum Balance: "+minimumBalance+" Rs"+"\nMonthlyFee: "+monthlyFee+" Rs"+"\nWithdrawal Limit: "+withdrawalLimit+" Rs";
    }

}
