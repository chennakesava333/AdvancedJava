package pack1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import oracle.jdbc.dcn.RowChangeDescription;

@SuppressWarnings("serial")
@WebServlet("/aes")
public class AddEmployeeServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
     {
    	 EmployeeBean empBean=new EmployeeBean();
    	 empBean.setEmpid(req.getParameter("eid"));
    	 empBean.setEmpfname(req.getParameter("efn"));
    	 empBean.setEmplname(req.getParameter("eln"));
    	 empBean.setEmpsal(Integer.parseInt(req.getParameter("esal")));
    	 empBean.setEmpAddress(req.getParameter("eads"));
    	 
    	 AddEmployeeDAO obj=new AddEmployeeDAO();
    	 int RowCount=obj.InsertData(empBean);
    	 if(RowCount>0) {
    		 req.setAttribute("msg","Employee Data inserted Successfully...<br><br>");
    		 RequestDispatcher rd=req.getRequestDispatcher("Display.jsp");
    		 rd.forward(req, res);
    	 }
    	 else 
    	 {
    		 req.setAttribute("msg","Employee Data Not inserted...<br>");
    		 RequestDispatcher rd=req.getRequestDispatcher("Display.jsp");
    		 rd.forward(req, res);
    	 }
     }
}
