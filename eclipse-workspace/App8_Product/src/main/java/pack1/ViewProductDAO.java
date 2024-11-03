package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import pack1.DBConnect;
import pack1.ProductBean;

public class ViewProductDAO 
{
    public ArrayList<ProductBean> al=new ArrayList<ProductBean>();
     
      public  ArrayList<ProductBean> reterive()
        {
    	
    	try 
    	{
    		Connection con=DBConnect.getCon();
    		PreparedStatement pstm=con.prepareStatement("select * from product");
    		ResultSet rs=pstm.executeQuery();
    		while(rs.next()) 
    		{
    			ProductBean pb=new ProductBean();
    			pb.setPid(rs.getString(1));
    			pb.setPname(rs.getString(2));
    			pb.setPprice(rs.getDouble(3));
    			pb.setPqty(rs.getInt(4));
    		}
    	}
    	catch(Exception e) 
    	{
    		e.printStackTrace();
    	}
    	return al;
    }
}
