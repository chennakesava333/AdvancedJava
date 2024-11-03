package pack1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/multi")
public class MultiplicationServlet extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		int x=Integer.parseInt(req.getParameter("num1"));
		int y=Integer.parseInt(req.getParameter("num2"));
		
		pw.println("<center>");
		pw.println("<h3> the Multiplication of "+x+" and "+y+" is : "+(x*y)+"</h3>");
		pw.println("</center>");
		
		RequestDispatcher rd=req.getRequestDispatcher("index.html");
		rd.include(req, res);
		
	}

}
