package com.pack1.static_factory_method;

class Product 
{
  private int productid;
  private String productName;
  private double price;
  private int quantity;
   
  public Product(int productid, String productName, double price, int quantity) 
  {
		super();
		this.productid = productid;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
    
  //static factory method
  public static Product cProduct(int productid, String productName, double price, int quantity) 
  {
    return new Product(productid,productName,price,quantity);
  }
  
  //method
  public double TotalAmmount() 
  {
	  double tamount = price * quantity;
	  if(tamount>1000) 
	  {
		tamount=tamount*0.10;  
	  }
	  else if(tamount>500) 
	  {
		  tamount=tamount*0.05;
	  }
	  return tamount;
  }

  @Override
  public String toString() 
  {
  	return "Product [productid=" + productid + ", productName=" + productName + ", price=" + price + ", quantity="
  			+ quantity + "]";
  }
  
  
}
