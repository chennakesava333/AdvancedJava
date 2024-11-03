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

@WebServlet("/update")
public class UpdateProfileServlet extends HttpServlet
{
    protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
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
    		ServletContext context=req.getServletContext();
    		UserBean bean=(UserBean)context.getAttribute("UBean");
    		//updated
    		bean.setFirstname(req.getParameter("ufname"));
    		bean.setLastname(req.getParameter("ulname"));
    		bean.setMail_id(req.getParameter("umail"));
    		bean.setPhone_no(req.getParameter("uponum"));
    		bean.setAge(Integer.parseInt(req.getParameter("uag")));
    		
    		       UpdateProfileDAO obj=new UpdateProfileDAO();
    				int rowCount=obj.updateDetails(bean);
    		
    		if(rowCount>0) 
    		{
    			 req.setAttribute("msg","Data Updated");
    		}
    		    for(Cookie ck:arr) {
    		    	if("cname".equals(ck.getName())) {
    		    		fname=ck.getValue();
    		    	}
    		    	req.setAttribute("fname", fname);
    		    	RequestDispatcher rd=req.getRequestDispatcher("updateprofile.jsp");
    		    	rd.forward(req, res);
    		    }
    	}
    }
}
