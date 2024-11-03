package com.pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcPro1 {
      void meth1() {
    	  String driver="oracle.jdbc.OracleDriver";   // thin driver class name
    	  String DBurl="jdbc:oracle:thin:@localhost:1521:orcl";  // database url
    	  String DBUname="system";   //database user name
    	  String DBUpwd="kesava";    //database password
    	  
    	  System.out.println("Connecting our Java program to Database");
    	  try {
    		  Class.forName(driver);  // Loading the driver
    		 Connection con = DriverManager.getConnection(DBurl,DBUname,DBUpwd); 
    		 System.out.println("DataBase successfully connected!!!");
    		 Statement stmt = con.createStatement();
    	     ResultSet rs= stmt.executeQuery("select * from Employee");
    	     while(rs.next()) {
    	    	 System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5));
    	     }
    	     System.out.println("\nData Reterived");
    	     con.close();
    	  }
    	  catch(Exception e) {
    		  e.printStackTrace();
    	  }
      }
      public static void main(String[] args) {
		new JdbcPro1().meth1();
	}
}
