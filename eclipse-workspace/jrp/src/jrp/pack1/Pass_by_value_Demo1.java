package jrp.pack1;
class product
{
   private double price;

   public product(double price) 
   {
		super();
		this.price = price;
	}

   public double getPrice() {
		return price;
	}

   public void setPrice(double price) {
		this.price = price;
	}

   @Override
   public String toString() {
   	return "product [price=" + price + "]";
   } 
}
public class Pass_by_value_Demo1 
{

	public static void main(String[] args) 
	{
		product p1= new product(12000);
		accept(p1);
		System.out.println(p1.getPrice());
	}
	public static void accept(product prod) 
	{
		
		prod.setPrice(18000);
		//prod.setPrice(200000);
		prod =new product(25000);
	}

}
