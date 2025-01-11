package jrp.pack1;

class Base
{
	public Base(int x) 
	{
		this();
		System.out.println("parameter constructor :"+x);
	}
	public Base() 
	{
		System.out.println("no argument constructor1");
	}
	
}
class Derived extends Base
{
	public Derived() 
	{
		super(15);
		System.out.println("no argument constructor");
	}
}
public class ConstructorChainingDemo3 
{

	public static void main(String[] args) 
	{
		new Derived();
	}

}
