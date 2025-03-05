package com.inheritance.account;

public class FixedDepositAccount extends Account{
	
	    protected int depositDuration; // In years, for example
	    protected String maturityDate; // Date when the FD matures
	    protected double penaltyRate; // Penalty applied if withdrawn early
	    protected double depositAmount; // The amount deposited in the fixed deposit
	
	public FixedDepositAccount() {
		
		super();
		depositDuration = 3;
		maturityDate = "12/4/2027";		
		depositAmount = 55000.55;
		penaltyRate = 0.1*depositAmount;
	}
	
    public FixedDepositAccount(int no, String n, int dur, String date, double penalty, double amt) {
    	
    	super(no,n);
    	depositDuration = dur;
		maturityDate = date;
		depositAmount = amt;
		penaltyRate = penalty*depositAmount;
		
	}
    
    /*public String toString() {
    	
    	return super.toString()+"\nAccount Type: Fixed Deposit Account"+"\nDeposit Amount: "+depositAmount+" Rs only"+"\nDeposit Duration: "+depositDuration+" (year/years)"+"\nMaturity Date: "+maturityDate+"\nPenalty Amount: "+penaltyRate+" Rs";
    }*/
    
    public String print() {
    	
    	return super.toString()+"\nAccount Type: Fixed Deposit Account"+"\nDeposit Amount: "+depositAmount+" Rs only"+"\nDeposit Duration: "+depositDuration+" (year/years)"+"\nMaturity Date: "+maturityDate+"\nPenalty Amount: "+penaltyRate+" Rs";
    }

}
