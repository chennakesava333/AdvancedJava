package com.pack1.day27;

import java.util.Scanner;

public class AreaCalculator 
{
    public static double calculateArea(double length,double width) 
    {
    	try {
    		if((length<0)||(width<0)) {
    	    throw new IllegalArgumentException();
    		}
    		else
    			return length*width;
    	}
    	catch(IllegalArgumentException e) {
    		System.out.println("IllegalArgumentException caugh :dimensions must be positive"+"\n(length ="+length+"  width ="+width+")");
    		throw new IllegalArgumentException();
    		
    	}
    	
    	
    }
    public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter length :");
		double l1=sc.nextDouble();
		System.out.println("enter width :");
		double w1=sc.nextDouble();
		System.out.println("area of rectangle :"+calculateArea(l1, w1));
		sc.close();
	}
}
