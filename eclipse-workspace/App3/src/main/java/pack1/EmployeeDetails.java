package pack1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@SuppressWarnings("serial")
@WebServlet("/de")
public class EmployeeDetails extends GenericServlet
{
	String driver="oracle.jdbc.OracleDriver";
    String dburl="jdbc:oracle:thin:@localhost:1521:orcl";
    String DBUname="system";
    String DBUpwd="kesava";
    
    
    Connection connect() {
		Connection con=null;
		try {
  		   con=DriverManager.getConnection(dburl,DBUname,DBUpwd);
  	  }
  	  catch(Exception e) {
  		  e.printStackTrace();
  	  }
		return con;
	}
	  

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	
		
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		String id=req.getParameter("eid");
		String fname=req.getParameter("efname");
		String lname=req.getParameter("elname");
		int sal=Integer.parseInt(req.getParameter("esal"));
		String ads=req.getParameter("eads");
		
		Connection con=connect();
		pw.println("connected successfully");
		try {
			PreparedStatement pstm=con.prepareStatement("insert into Employee values(?,?,?,?,?)");
			
			
			
			pstm.setString(1, id);
			pstm.setString(2, fname);
			pstm.setString(3, lname);
			pstm.setInt(4, sal);
			pstm.setString(5, ads);
			int rs=pstm.executeUpdate();
			if(rs>0) 
			{
				pw.println("<center>");
				pw.println("data inserted.");
				
				con.close();
			}
			else
			{
				pw.println("<center>");
				pw.println("data not inserted");
			}
		}
		catch(NumberFormatException nfs) {
			pw.println("invalid input");
			nfs.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	
	/*@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String fname="chennakesava";
		String pas="12345678";
          
		String name=req.getParameter("uname");
		String psd=req.getParameter("psw");
		
		
		if((fname.equals(name)&&pas.equals(psd))) {
			pw.println("<center>");
			pw.println("<br> Welcome :"+name);
			pw.println("<br> YOU did the Task");
		}
		else {
			pw.println("<center>");
			pw.println("<br> Welcome :"+name);
			pw.println("<br> invalid Credentials!!!!!");
		}
	}
      */
}
