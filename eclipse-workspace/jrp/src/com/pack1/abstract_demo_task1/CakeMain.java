package com.pack1.abstract_demo_task1;

public class CakeMain {

	public static void main(String[] args) 
	{
		OrderedCake cake1 = new OrderedCake();
		cake1.showCake();

		
		OrderedCake cake2 = new OrderedCake("square","chocolate",2);
		cake2.showCake();
		
		OrderedCake cake3 = new OrderedCake("square","chocolate",2,"Happy Birthday");
		cake3.showCake();
	}

}
