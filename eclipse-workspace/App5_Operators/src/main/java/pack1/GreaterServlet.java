package pack1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/gre")
public class GreaterServlet extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		int x=Integer.parseInt(req.getParameter("num1"));
		int y=Integer.parseInt(req.getParameter("num2"));
		
		if(x>y) {
			pw.println("<center>");
			pw.println("<h3> the "+x+" is greater than "+y+"</h3>");
			pw.println("</center>");
		}
		else if(y>x){
			pw.println("<center>");
			pw.println("<h3> the "+y+" is greater than "+x+"</h3>");
			pw.println("</center>");
		}
		else {
			pw.println("<center>");
			pw.println("<h3> the num1 and num2 both are same numbers</h3>");
			pw.println("</center>");
		}
		RequestDispatcher rd=req.getRequestDispatcher("index.html");
		rd.include(req, res);
	}


}
