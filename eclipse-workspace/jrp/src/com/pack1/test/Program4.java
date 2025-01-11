package com.pack1.test;

import java.util.ArrayList;

public class Program4 
{
	public static void main(String[] args) 
	{
		
	ArrayList<Integer>al=new ArrayList<Integer>();
     al.add(12);
     al.add(16);
     al.add(34);
     al.add(78);
     al.remove(12);          //java.lang.IndexOutOfBoundsException:Index 12 out of bounds for length 4
     System.out.println(al);
	}

}
