package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AddEmployeeDAO 
{
   int InsertData(EmployeeBean eb) {
	  int RowCount=0;
	  try {
		  Connection con=DBConnect.getCon();
		  PreparedStatement pstm=con.prepareStatement("insert into employee values(?,?,?,?,?)");
		  pstm.setString(1,eb.getEmpid());
		  pstm.setString(2,eb.getEmpfname());
		  pstm.setString(3,eb.getEmplname());
		  pstm.setInt(4,eb.getEmpsal());
		  pstm.setString(5,eb.getEmpAddress());
		  
		  RowCount= pstm.executeUpdate();
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
	  
	  return RowCount;
   }
}
