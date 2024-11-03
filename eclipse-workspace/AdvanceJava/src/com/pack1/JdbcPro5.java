package com.pack1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcPro5 {
      String driver="oracle.jdbc.OracleDriver";
      String Dburl="jdbc:oracle:thin:@localhost:1521:orcl";
      String DBUname="system";
      String DBUpwd="kesava";
      void meth1() {
    	  try {
    		  Connection con=DriverManager.getConnection(Dburl,DBUname,DBUpwd);
    		  System.out.println("DB connected successfully");
    		  CallableStatement cstm=con.prepareCall("{call }");
    	  }
    	  catch(Exception e) {
    		  e.printStackTrace();
    	  }
      }
}
