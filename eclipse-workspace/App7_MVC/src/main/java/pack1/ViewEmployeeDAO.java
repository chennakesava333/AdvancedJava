package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ViewEmployeeDAO 
{
  public  ArrayList<EmployeeBean> al=new ArrayList<EmployeeBean>();
   
      public ArrayList<EmployeeBean> reterive()
      {
	   
	   try 
	   {
		   Connection con=DBConnect.getCon();
		   PreparedStatement pstm=con.prepareStatement("select * from employee");
		   ResultSet rs=pstm.executeQuery();
		   while(rs.next()) 
		   {
			   EmployeeBean eb=new EmployeeBean();
			   eb.setEmpid(rs.getString(1));
			   eb.setEmpfname(rs.getString(2));
			   eb.setEmplname(rs.getString(3));
			   eb.setEmpsal(rs.getInt(4));
			   eb.setEmpAddress(rs.getString(5));
			   al.add(eb);
		   }
	   }
	   catch(Exception e)
	   {
		   e.printStackTrace();
	   }
	   return al;
   }
}
