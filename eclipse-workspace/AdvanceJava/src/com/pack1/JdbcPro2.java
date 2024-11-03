package com.pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcPro2 {
	         Scanner sc = new Scanner(System.in);
	         String driver="oracle.jdbc.OracleDriver";
	         String DBurl="jdbc:oracle:thin:@localhost:1521:orcl";
	         String DBUname="system"; 
	         String DBUpwd="kesava";
	         String sqlquery1="select * from ";
	         String sqlQuery2="insert into employee values('104','adarsh','badisa',30000,'hyd')";
   Connection connect() {
	      Connection con=null;
	   try {
		   Class.forName(driver); //thin driver class
		 con = DriverManager.getConnection(DBurl,DBUname,DBUpwd);
		  System.out.println("Data Base successfully Connected!!!");
	   }
	   catch(Exception e){
		   e.printStackTrace();
	   }
	   return con;
   }
   void meth1() {
	   System.out.println("retriving the data");
	   Connection con=connect();
	   try {
		   Statement stmt= con.createStatement();
		   System.out.println("enter table name");
		  ResultSet rs = stmt.executeQuery(sqlquery1.concat(sc.nextLine()));
		  while(rs.next()) {
			  
			  System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5));
		  }
		  System.out.println("\n data retrived");
		  con.close();
	   }
	   catch(Exception e) {
		   e.printStackTrace();
	   }
	   
   }
   void meth2() {
	   System.out.println("inserting the data");
	  Connection con=connect();
	  try {
		 Statement stmt = con.createStatement();
		int rowCount = stmt.executeUpdate(sqlQuery2);
		if(rowCount==1) {
			System.out.println(rowCount+" row is updated");
			System.out.println("see the table yes/no");
			String choice=sc.nextLine().toLowerCase();
			if("yes".equals(choice)) {
				meth1();
			}
			else {
				System.out.println("see you soon...!");
				System.exit(0);
			}
		}
		else {
			System.out.println("no data updated");
		}
		 con.close();
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
   }
   void meth3() {
	   System.out.println("retriving the specific data");
	   Connection con=connect();
	   try {
		  Statement stmt = con.createStatement();
		  System.out.println("enter the empid :");
		  String eid=sc.nextLine();
		  ResultSet rs=stmt.executeQuery("select * from employee where eid='"+eid+"'");
		  if(rs.next()) {
			  System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5));
		  }
		  else {
			  System.out.println("check once "+eid);
			  System.out.println("there is no available record");
		  }
		  con.close();
	   }
	   catch(Exception e) {
		   e.printStackTrace();
	   }
   }
   void meth4() {
	   System.out.println("deleting the data");
	   Connection con=connect();
	   try {
		   Statement stmt = con.createStatement();
		   System.out.println("enter the empid :");
		   String eid = sc.nextLine();
		   int rowCount = stmt.executeUpdate("delete from employee where eid='"+eid+"'");
		   if(rowCount==1) {
			   System.out.println(rowCount+"row deleted");
		   }
		   else {
			   System.out.println("there is no data available!.");
		   }
		   con.close();
	   }
	   catch(Exception e) {
		   e.printStackTrace();
	   }
	 
   }
   public static void main(String[] args) {
	JdbcPro2 obj=new JdbcPro2();
	//obj.meth1();
	//obj.meth2();
	//obj.meth3();
	obj.meth4();
}
}
