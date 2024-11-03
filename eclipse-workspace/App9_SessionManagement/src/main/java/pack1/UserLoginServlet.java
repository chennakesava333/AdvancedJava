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

@WebServlet("/login")
public class UserLoginServlet extends HttpServlet
{
	@Override
  protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
  {
	    UserLoginDAO obj=new UserLoginDAO();
	    UserBean bean=obj.retriveData(req.getParameter("uname"), req.getParameter("pswd"));
	    if(bean==null) {
	    	req.setAttribute("msg", "invalid Login credientials...!");
	    	RequestDispatcher rd=req.getRequestDispatcher("register.jsp");
	    	rd.forward(req, res);
	    }
	    else 
	    {
	    	ServletContext context=req.getServletContext();
	    	context.setAttribute("UBean",bean);
	    	Cookie ck=new Cookie("cname",bean.getFirstname());
	    	res.addCookie(ck);
	    	RequestDispatcher rd=req.getRequestDispatcher("home.jsp");
	    	rd.forward(req, res);
	    }
  }
}
