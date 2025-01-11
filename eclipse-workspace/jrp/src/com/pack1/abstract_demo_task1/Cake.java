package com.pack1.abstract_demo_task1;

public abstract class Cake 
{
   private String shape;
   private String flavor;
   private int qty;
   private float price;


   protected Cake(String shape, String flavor, int qty) {
		super();
		this.shape = shape;
		this.flavor = flavor;
		this.qty = qty;
		this.price =qty*400; //price is dynamically chainged
	}

      
   //getters & setters
   protected String getShape() {
		return shape;
	}


	protected void setShape(String shape) {
		this.shape = shape;
	}


	protected String getFlavor() {
		return flavor;
	}


	protected void setFlavor(String flavor) {
		this.flavor = flavor;
	}


	protected int getQty() {
		return qty;
	}


	protected void setQty(int qty) {
		this.qty = qty;
		this.price =qty*400;
	}


	protected float getPrice() {
		return price;
	}


	protected void setPrice(float price) {
		this.price = price;
	} 
	
	protected void showCake() 
	{
		System.out.println("A "+shape+" "+flavor+" "+"cake of "+qty+" "+"kg/kg's Ready @" +price);
	}
   
}
