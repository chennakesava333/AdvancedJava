package pack1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/edit")
public class EditProfileServlet extends HttpServlet
{
   protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
   {
	   String fname=null;
	   Cookie arr[]=req.getCookies();
	   if(arr==null) 
	   {
		   req.setAttribute("msg", "Session Expired");
		   RequestDispatcher rd=req.getRequestDispatcher("register.jsp");
		   rd.forward(req, res);
	   }
	   else 
	   {
		   for(Cookie ck:arr) {
			   if("cname".equals(ck.getName())) {
				   fname=ck.getValue();
			   }
		   }
		   req.setAttribute("fname", fname);
		   RequestDispatcher rd=req.getRequestDispatcher("editprofile.jsp");
		   rd.forward(req, res);
	   }
   }
}
