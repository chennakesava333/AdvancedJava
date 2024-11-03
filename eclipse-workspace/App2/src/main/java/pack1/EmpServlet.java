package pack1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@SuppressWarnings("serial")
@WebServlet("/es")
public class EmpServlet extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
	    PrintWriter pw=res.getWriter();
	    res.setContentType("text/html");
	    
	    String name=req.getParameter("ename");
	    String id=req.getParameter("eid");
	    double sal=Double.parseDouble(req.getParameter("esal"));
	    int exp=Integer.parseInt(req.getParameter("eexp"));
	    
	    pw.println("<center>");
	    pw.println("**** Employee Data****");
	    pw.println("<br> Employee Name is : "+name);
	    pw.println("<br> Employee Id is : "+id);
	    if(exp>=5) 
	    {
	    	sal=sal+sal*0.1;
	        pw.println("<br> Employee Salary is : "+sal);
	    }
	    else 
	    {
	    	pw.println("<br> Employee Salary is : "+sal);
	    }
	    pw.println("<br> Employee Experiance is : "+exp);
	    pw.println("</center>");
	    
	}

}
