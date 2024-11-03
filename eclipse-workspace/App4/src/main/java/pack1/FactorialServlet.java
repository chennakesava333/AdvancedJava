package pack1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/fs")
public class FactorialServlet extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	       PrintWriter pw=res.getWriter();
	       res.setContentType("text/html");
	       
	       int i=Integer.parseInt(req.getParameter("num"));
	       int fact=1;
	       for(;i>=1;i--) {
	    	   fact=fact*i;
	       }
		pw.println("<center>");
		pw.println("<h1> the Facorial for "+req.getParameter("num")+" is : "+fact+"</h1>");
		pw.println("</center>");
		
		//RequestDispatcher rd=req.getRequestDispatcher("index.html");
		//rd.include(req, res);
	}
	    

}
