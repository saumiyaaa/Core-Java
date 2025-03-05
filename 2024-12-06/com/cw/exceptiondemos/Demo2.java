package com.cw.exceptiondemos;
class Emp
{
	int empid;
	String name;
	public Emp()
	{
		empid=1;
		name="Sagar";
	}
	public void print()
	{
		System.out.println(empid+" "+name);
	}
}
public class Demo2 {
	public static void main(String[] args) {
		
		Emp e1=new Emp();
		
		try {
	      e1.print();
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
		
		int a=10,b=20;
		System.out.println("Sum= "+(a+b));
		
		if(a>b)
		System.out.println(a+" is max");
		else
     	System.out.println(b+" is max");
		
	}

}
