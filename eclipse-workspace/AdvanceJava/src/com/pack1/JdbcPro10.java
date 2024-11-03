package com.pack1;

import java.sql.Connection;

public class JdbcPro10 
{
	 String Dburl="jdbc:oracle:thin:@localhost:1521:orcl";
     String DBUname="system";
     String DBUpwd="kesava";
     
     ConnectionPooling cp=new ConnectionPooling(Dburl,DBUname,DBUpwd);
     void meth1() {
    	 System.out.println("calling con_initialization");
    	 cp.con_Initialization();
    	 System.out.println("size of vector "+cp.v.size());
    	 System.out.println("****user1****");
    	 Connection con1=cp.con_Acquisition();
    	 System.out.println("size of vector "+cp.v.size());
    	 
    	 System.out.println("****user2****");
    	 Connection con2=cp.con_Acquisition();
    	 System.out.println("size of vector "+cp.v.size());
    	 
    	 System.out.println("****user3****");
    	 Connection con3=cp.con_Acquisition();
    	 System.out.println("size of vector "+cp.v.size());
    	 
    	 cp.con_Return(con1);
    	 cp.con_Return(con2);
    	 cp.con_Return(con3);
    	 System.out.println("size of vector "+cp.v.size());
     }
     public static void main(String[] args) {
		new JdbcPro10().meth1();
	}
	
}
