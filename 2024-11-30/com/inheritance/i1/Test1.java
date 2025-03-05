package com.inheritance.i1;

import com.inheritance.employee.*;

public class Test1 {
	
	public static void main(String [] args) {
		
		Employee e = new Manager(132, "Taylor", 500000, 4, 0.27);
		System.out.println(e);
		System.out.println("\n");
		System.out.println("Total Salary: "+e.SalCalc());
		
		Manager m = (Manager)e; // Down Casting
		System.out.println("Incentives: "+m.InctCalc());
		//System.out.println("Incentives: "+((Manager) e).InctCalc());//2nd Method of Down Casting
	}

}
