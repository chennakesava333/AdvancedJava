package com.pack1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class JdbcPro4 {
	String driver = "oracle.jdbc.OracleDriver";
	String DBurl = "jdbc:oracle:thin:@localhost:1521:orcl";
	String DBName = "system";
	String DBUpwd ="kesava";
	String sqlQuery="select eid,efname,esal from employee";
	/*void meth1() {
		System.out.println("implementing RowSet Interface");
	try {
		RowSetFactory rsf = RowSetProvider.newFactory();
		JdbcRowSet jrs= rsf.createJdbcRowSet();
		jrs.setUrl(DBurl);
		jrs.setUsername(DBName);
		jrs.setPassword(DBUpwd);
		jrs.setCommand(sqlQuery);
		jrs.execute();
		System.out.println("DB Connected successfully");
		jrs.beforeFirst();
		while(jrs.next()) {
			System.out.println(jrs.getString(1)+" "+jrs.getString(2)+" "+jrs.getString(3)+" "+jrs.getInt(4)+" "+jrs.getString(5));
		}
		System.out.println("------------------------");
		jrs.last();
		System.out.println(jrs.getString(1)+" "+jrs.getString(2)+" "+jrs.getString(3)+" "+jrs.getInt(4)+" "+jrs.getString(5));
		System.out.println("------------------------");
		jrs.first();
		System.out.println(jrs.getString(1)+" "+jrs.getString(2)+" "+jrs.getString(3)+" "+jrs.getInt(4)+" "+jrs.getString(5));
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}*/
  
  void meth2(){
	try {
		RowSetFactory rsf = RowSetProvider.newFactory();
		CachedRowSet crs =rsf.createCachedRowSet();
		crs.setUrl(DBurl);
		crs.setUsername(DBName);
		crs.setPassword(DBUpwd);
		crs.setCommand(sqlQuery);
		crs.execute();
		
		
		while(crs.next()) {
			String id=crs.getString(1);
			if(id.equals("102")) {
				crs.updateInt("esal", 70000);
				crs.updateRow();
			}
		}
		
		crs.acceptChanges();
		
		
		System.out.println("Data Updated");
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}
	

public static void main(String[] args) {
	JdbcPro4 obj=new JdbcPro4();
	//obj.meth1();
	obj.meth2();
}
}
