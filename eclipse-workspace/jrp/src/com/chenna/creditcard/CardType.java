package com.chenna.creditcard;

public class CardType 
{
   private Customer Customer;
   private String cardtype;

   public CardType(Customer customer, String cardtype) 
   {
		super();
		Customer = customer;
		this.cardtype = cardtype;
	}

   @Override
   public String toString() {
   	return "The Customer "+Customer+" is Eligible for "+cardtype+" Card";
   }  
   
}
