package pack1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@SuppressWarnings("serial")
@WebServlet("/fs")
public class FirstServlet extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		String name=req.getParameter("uname");
		String email=req.getParameter("umail");
		
		pw.println("<center>");
		pw.println("****Data from Servlet****");
		pw.println("<br> User Name is : "+name);
		pw.println("<br> User mail-id is : "+email);
		pw.println("<center>");
		
	}

}
