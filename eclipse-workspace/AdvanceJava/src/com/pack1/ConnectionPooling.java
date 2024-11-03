package com.pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;

public class ConnectionPooling 
{
  String dburl,dBUname,DBUpwd;
    Vector<Connection>v=new Vector<Connection>();
  public ConnectionPooling(String dburl,String dBUname,String DBUpwd) 
  {
	  this.dburl=dburl;
	  this.dBUname=dBUname;
	  this.DBUpwd=DBUpwd;
	  
	  
  }
  void con_Initialization() {
	  System.out.println("creating '5'connection objects\n");
	  System.out.println("Connetion pool is empty");
	  while(v.size()<5) {
		  try {
			  Connection con=DriverManager.getConnection(dburl,dBUname,DBUpwd);
			  v.addElement(con);
		  }
		  catch(SQLException e) {
			  e.printStackTrace();
		  }
	  }
	  for(Object o:v) {
		  System.out.println(o);
	  }
  }
  Connection con_Acquisition() {
	  System.out.println("Assigning a connection object");
	  Connection con=v.elementAt(0);
	  v.remove(0);
	  return con;
  }
  void con_Return(Connection con) {
	  System.out.println("return the connection object");
	v.addElement(con);
	for(Object o:v)
		  System.out.println(o);
		
  }
}
