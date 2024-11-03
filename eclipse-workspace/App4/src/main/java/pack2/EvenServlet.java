package pack2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/es")
public class EvenServlet extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		 PrintWriter pw=res.getWriter();
	     res.setContentType("text/html");
		
	     int i=Integer.parseInt(req.getParameter("num"));
	     
	     if(i%2==0) 
	     {
	    	 pw.println("<center>");
	 		pw.println("<h1>"+req.getParameter("num")+" is : EVEN </h1>");
	 		pw.println("</center>");
	     }
	     else 
	     {
	    	    pw.println("<center>");
		 		pw.println("<h1>"+req.getParameter("num")+"is : ODD </h1>");
		 		pw.println("</center>"); 
	     }
	     RequestDispatcher rd=req.getRequestDispatcher("index.html");
		 rd.include(req, res);
	}

}
