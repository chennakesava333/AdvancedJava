package pack1;

import java.io.IOException;
import java.rmi.ServerException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/view")
public class ViewEmployeeServlet extends HttpServlet
{
     protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
     {
    	 ViewEmployeeDAO obj=new ViewEmployeeDAO();
    	 ArrayList<EmployeeBean> al=obj.reterive();
    	 
    	 req.setAttribute("List", al);
    	 RequestDispatcher rd=req.getRequestDispatcher("ViewEmployee.jsp");
    	 rd.forward(req, res);
     }
}
