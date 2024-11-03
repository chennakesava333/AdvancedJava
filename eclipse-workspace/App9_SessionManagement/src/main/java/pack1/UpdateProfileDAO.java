package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateProfileDAO
{
  public int updateDetails(UserBean bean) 
  {
	  int rowCount=0;
	  
	  try
	  {
		  Connection con=DBConnect.getCon();
		  PreparedStatement pstm=con.prepareStatement("update registration set firstname=?,lastname=?,mailid=?,phonenumber=?,age=? where username=?");
		  pstm.setString(1, bean.getFirstname());
		  pstm.setString(2, bean.getLastname());
		  pstm.setString(3, bean.getMail_id());
		  pstm.setString(4, bean.getPhone_no());
		  pstm.setInt(5, bean.getAge());
		  pstm.setString(6, bean.getUsername());
		  rowCount =pstm.executeUpdate();
	  }
	  catch(Exception e) 
	  {
		  e.printStackTrace();
	  }
	  return rowCount;
  }
}
