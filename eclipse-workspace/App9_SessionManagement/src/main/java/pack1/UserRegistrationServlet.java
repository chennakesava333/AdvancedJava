package pack1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/urs")
public class UserRegistrationServlet extends HttpServlet
{
    protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException 
    {
    	UserBean bean=new UserBean();
    	bean.setUsername(req.getParameter("uname"));
    	bean.setFirstname(req.getParameter("fname"));
    	bean.setLastname(req.getParameter("lname"));
    	bean.setAge(Integer.parseInt(req.getParameter("uage")));
    	bean.setMail_id(req.getParameter("umid"));
    	bean.setPhone_no(req.getParameter("upnum"));
    	bean.setPassword(req.getParameter("upswd"));
    	bean.setConfirm_Password(req.getParameter("ucpswd"));
    	
    	UserRegisterDAO obj=new UserRegisterDAO();
    	int RowCount=obj.InsertData(bean);
    	if(RowCount>0) 
    	{
    		req.setAttribute("msg", "Data Registred Successfully...!<br>");
    		RequestDispatcher rd=req.getRequestDispatcher("register.jsp");
    		rd.forward(req, res);
    		
    	}
    	else 
    	{
    		req.setAttribute("msg", "Data NOT Registred...!<br>");
    		RequestDispatcher rd=req.getRequestDispatcher("register.jsp");
    		rd.forward(req, res);
    		
    	}
    	
    }
}
