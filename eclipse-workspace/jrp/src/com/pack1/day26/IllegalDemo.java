package com.pack1.day26;

public class IllegalDemo 
{
	static void throwIllegalException() 
	{
		try 
		{
			throw new IllegalStateException("my Exception");
		}
        catch(IllegalStateException objA) 
		{
        	System.out.println("caught : "+objA);
        	
        }
	}

	public static void main(String[] args) 
	{
		System.out.println("calling throwIllegalException from main method :");
		IllegalDemo.throwIllegalException();
	}

}
