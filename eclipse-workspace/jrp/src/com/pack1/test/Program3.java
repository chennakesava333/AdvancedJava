package com.pack1.test;


class Test
{
	public void accept(long ...b) 
	{
		System.out.println("long");   //default output
	}
	public void accept(double ...s) 
	{
		System.out.println("double");
	}
	public void accept(float ...s) 
	{
		System.out.println("float");
	}
}
public class Program3 
{

	public static void main(String[] args) 
	{
		Test t=new Test();
		t.accept();  

	}

}
