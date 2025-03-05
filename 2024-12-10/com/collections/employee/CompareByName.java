package com.collections.employee;

import java.util.Comparator;

public class CompareByName implements Comparator<Employee>{

	  
        @Override
		 public int compare(Employee e1, Employee e2) {
             //Employee e1 = (Employee) o1;
             //Employee e2 = (Employee) o2;
             return e1.name.compareTo(e2.name);
         }

	

}
