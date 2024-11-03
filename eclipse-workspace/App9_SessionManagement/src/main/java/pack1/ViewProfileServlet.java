package pack1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/view")
public class ViewProfileServlet extends HttpServlet
{
	@Override
   protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException 
   {
	   Cookie arr[]=req.getCookies();
	   String fname=null;
	   
	   if(arr==null) 
	   {
		   req.setAttribute("msg", "Session Experied...!");
		   RequestDispatcher rd=req.getRequestDispatcher("register.jsp");
		   rd.forward(req, res);
	   }
	   else 
	   {
		   for (Cookie c:arr) {
			   if("cname".equals(c.getName())) {
				   fname=c.getValue();
			   }   
		   }
		   req.setAttribute("fname", fname);
		  RequestDispatcher rd=req.getRequestDispatcher("viewprofile.jsp");
		  rd.forward(req, res);
	   }
   }
}
