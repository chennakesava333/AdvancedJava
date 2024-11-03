package pack1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet
{
	@Override
   protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
   {
	  Cookie arr[]= req.getCookies();
	    if(arr==null) {
	    	req.setAttribute("msg", "Session Experied");
	    }
	    else 
	    {
	    	ServletContext context=req.getServletContext();
	    	context.removeAttribute("UBean");
	    	
	    	arr[0].setMaxAge(0);
	    	res.addCookie(arr[0]);
	    	req.setAttribute("msg", "User LoggedOut Successfully...!");
	    }
	    RequestDispatcher rd=req.getRequestDispatcher("register.jsp");
	    rd.forward(req, res);
   }
}
