package pack1;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ProductBean implements Serializable 
{
      private String pid;
      private String pname;
      private double pprice;
      private int pqty;
      
      
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPprice() {
		return pprice;
	}
	public void setPprice(double pprice) {
		this.pprice = pprice;
	}
	public int getPqty() {
		return pqty;
	}
	public void setPqty(int pqty) {
		this.pqty = pqty;
	}
      
	public ProductBean() {}
}
