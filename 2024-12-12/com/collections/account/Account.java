package com.collections.account;

public class Account {
	
		
		protected int accNo;
		protected String name;
		
		public Account(){
			
			accNo = 12345;
			name = "Michael";
		}
		
		public Account(int no, String n){
			
			accNo = no;
			name = n;
			
		}
		
		@Override
		public String toString() {
			
			return "Account No: "+accNo+"\nName: "+name;
		}
		
	   

	}



