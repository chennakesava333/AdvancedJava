package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UserRegisterDAO 
{
   int InsertData(UserBean ub) 
   {
	     int RowCount=0;
	          try 
	          {
	        	  Connection con=DBConnect.getCon();
	        	  PreparedStatement pstm=con.prepareStatement("insert into registration values(?,?,?,?,?,?,?,?)");
	        	  
	        	  pstm.setString(1, ub.getUsername());
	        	  pstm.setString(2, ub.getFirstname());
	        	  pstm.setString(3, ub.getLastname());
	        	  pstm.setString(4, ub.getMail_id());
	        	  pstm.setString(5, ub.getPhone_no());
	        	  pstm.setString(6, ub.getPassword());
	        	  pstm.setString(7, ub.getConfirm_Password());
	        	  pstm.setInt(8, ub.getAge());
	        	 
	        	  
	        	  RowCount=pstm.executeUpdate();
	          }
	          catch(Exception e) 
	          {
	        	  e.printStackTrace();
	          }
	     
	     return RowCount;
   }
}
