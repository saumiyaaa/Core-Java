package com.interfaces.bankingsystem;

public class SavingsAccount extends BankAccount implements Accounts{
	

	protected double minimumBalance;
	protected double monthlyFee;
	protected int withdrawalLimit;
	
	public SavingsAccount() {
		
		super();
		minimumBalance = 5000;
		monthlyFee = 50;
		withdrawalLimit = 300000;
	}
	
    public SavingsAccount(int no, String n, double bal, double fee, int limit) {
    	
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


	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calculateInterest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void balance() {
		// TODO Auto-generated method stub
		
	}

}
