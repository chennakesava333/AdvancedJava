package pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import static pack1.DBinfo.*;

public class DBConnect 
{
   private static Connection con=null;
   private DBConnect() {}
    static 
    {
    	try 
    	{
    		Class.forName(driver);
    		con=DriverManager.getConnection(Dburl,Dbuname,Dbupwd);
    	}
    	catch(Exception e) 
    	{
    		e.printStackTrace();
    	}
    }
    public static Connection getCon() {
    	return con;
    }
}
