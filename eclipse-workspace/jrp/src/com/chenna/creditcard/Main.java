package com.chenna.creditcard;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter customer name :");
		String name=sc.nextLine();
		System.out.println("Enter customer credit points :");
		int points=sc.nextInt();
		Customer customer=new Customer(name,points);
		CardType cardtype=CardOnOffer.getOfferedCard(customer);
		System.out.println(cardtype);
         sc.close();
	}

}
