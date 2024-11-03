package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddProductDAO 
{
  int insertdata(ProductBean pb) {
	  int RowCount=0;
	  try 
	  {
		 Connection con=DBConnect.getCon();
		 PreparedStatement pstm=con.prepareStatement("insert into product values(?,?,?,?)");
		 pstm.setString(1, pb.getPid());
		 pstm.setString(2, pb.getPname());
		 pstm.setDouble(3, pb.getPprice());
		 pstm.setInt(4, pb.getPqty());
		 
		 RowCount=pstm.executeUpdate();
	  }
	  catch(SQLException e) 
	  {
		  e.printStackTrace();
	  }
	  return RowCount;
  }
}
