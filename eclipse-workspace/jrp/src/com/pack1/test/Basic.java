package com.pack1.test;
class A
{
	public void foo() 
	{
		System.out.println("A");
	}
}
class B extends A
{
	public void foo() 
	{
		System.out.println("B");
	}
}
public class Basic
{
  public static void main(String[] args) 
  {
	A obja;
	B objb = new B();
	objb.foo();
	obja =objb;
	obja.foo();
  }
}
