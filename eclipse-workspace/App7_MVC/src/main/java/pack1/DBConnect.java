package pack1;

import java.sql.Connection;
import java.sql.DriverManager;
//import static pack1.DBinfo.*;     //connection for DBinfo

public class DBConnect 
{
	
    private static Connection con=null;
    
    private DBConnect() {}
    
    static
    {
    	try 
    	{
    		Class.forName(DBinfo.driver);
    		con=DriverManager.getConnection(DBinfo.DBurl,DBinfo.DBuname,DBinfo.DBupwd);
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
