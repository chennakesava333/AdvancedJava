package com.chenna.creditcard;

public class CardOnOffer 
{
  
    private static CardType CardType;

   public static CardType getOfferedCard(Customer customer) 
   {
	   int creditPoints = customer.getCreditPoints();
	   String cardType = null;
	   
	    if(creditPoints>=100 && creditPoints<=500)
	   {
		   cardType="silver";
	   }
	   else if(creditPoints>=501 && creditPoints<1000) 
	   {
		   cardType="Gold";
	   }
	   else if(creditPoints>=1000) 
	   {
		  cardType="platinum"; 
	   }
	   else if(creditPoints<100) 
	   {
		   cardType="EMI";
	   }
	   else 
	   {
		   System.out.println("no card available");
	   }
	   
	   return new CardType(customer,cardType);
   }

}
