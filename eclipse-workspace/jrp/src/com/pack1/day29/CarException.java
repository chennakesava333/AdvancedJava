package com.pack1.day29;

import java.util.Scanner;

@SuppressWarnings("serial")
class CarStoppedException extends Exception
{
	public CarStoppedException(String stop) 
	{
		super(stop);
	}
}


@SuppressWarnings("serial")
class CarPunctureException extends Exception
{
	public CarPunctureException(String puncture) 
	{
		super(puncture);
	}
}


@SuppressWarnings("serial")
class CarHeatException extends Exception
{
	public CarHeatException(String heat) 
	{
		super(heat);
	}
}


class CarTest
{
	static Scanner sc=new Scanner (System.in);
	public static void test(String s) throws CarStoppedException, CarPunctureException, CarHeatException 
	{
		switch(s.toLowerCase()) {
		case "stop":
			throw new CarStoppedException("Car stopped for some reason:");
		  case"puncture":
		throw new CarPunctureException("car is punctured");
		case"heat":
			System.out.println("enter the data :");
			int data=sc.nextInt();
				if(data>50)
				throw new CarHeatException("car is heatedbmore than 50 degrees celsious");
				else if(data>0 && data<=50)
					System.out.println("car temperature normal");
				else
					System.err.println("invalid input:");
				
			break;
		case"move":
			System.out.println("car not punctured (or) car not stalled.");
            break;
            default:{
            	System.out.println("invalid inpot :");
            }
           
		}
	}
}


public class CarException 
{
	public static void main(String[] args) throws CarStoppedException, CarPunctureException, CarHeatException {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the data :");
		String data=sc.nextLine();
		
		CarTest.test(data);
		sc.close();
	}
   
}
