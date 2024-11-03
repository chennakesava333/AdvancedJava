package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserLoginDAO 
{
    public UserBean retriveData(String UserName,String Password) {
    	UserBean bean=null;
    	try 
    	{
    		Connection con=DBConnect.getCon();
    		PreparedStatement pstm=con.prepareStatement("select * from registration where username=? and password=?");
    		pstm.setString(1, UserName);
    		pstm.setString(2, Password);
    		//pstm.setString(3, bean.getConfirm_Password());
    		ResultSet rs=pstm.executeQuery();
    		if(rs.next()) {
    			
    			bean=new UserBean();
    			bean.setUsername(rs.getString(1));
    			bean.setFirstname(rs.getString(2));
    			bean.setLastname(rs.getString(3));
    			bean.setMail_id(rs.getString(4));
    			bean.setPhone_no(rs.getString(5));
    			bean.setPassword(rs.getString(6));
    			bean.setConfirm_Password(rs.getString(7));
    			bean.setAge(rs.getInt(8));
    		}
    		
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    	
    	return bean;
    }
	
}
