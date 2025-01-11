package com.pack1.abstract_demo_task1;

public class OrderedCake extends Cake
{

	private String message;

	public OrderedCake() 
	{
		super("round","vanilla", 1);
		this.message = null;
	}
	
	public OrderedCake(String shape,String flavour,int qty)
	{
		super(shape,flavour,qty);
		this.message = null;
	}
	
	public OrderedCake(String shape,String flavour,int qty,String message) 
	{
		super(shape,flavour,qty);
		this.message = message;
	}
    
	@Override
	public void showCake() 
	{
		if(message !=null && !message.isEmpty()) 
		{
			System.out.println(getShape()+" "+getFlavor()+" Cake of "+getQty()+" kg/kg's ready with message "+message+" @Rs."+getPrice()+"/-");
		}
		else 
		{
		super.showCake();	
		}
	}

	
}
