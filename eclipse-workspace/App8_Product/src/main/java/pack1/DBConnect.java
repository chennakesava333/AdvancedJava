package pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import static pack1.DBinfo.*;   //DBinfo driver connection
public class DBConnect 
{
    private static Connection con=null;
      private DBConnect() {}
  static 
  {
	  try 
	  {
		  Class.forName(driver);
		 con=DriverManager.getConnection(DBUrl,DBUname,DBUpwd);
	  }
	  catch(Exception e){
		  e.printStackTrace();
	  }
  }
  public static Connection getCon() {
	  return con;
  }
}

