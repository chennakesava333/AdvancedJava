package com.pack1.test;

import java.util.HashSet;

public class Program5 
{

	public static void main(String[] args) 
	{
		HashSet set = new HashSet<>();
		set.add(new String("nit"));
		set.add(new String("nit"));  // both strings are same hash set are checks the data same or not if same data it's invoked  
		System.out.println(set.size());   // size is 1 because the same data are invoked store one place

	}

}
