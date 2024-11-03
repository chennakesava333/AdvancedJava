package pack1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/pes")
public class AddProductServlet extends HttpServlet
{
      protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
      {
    	  ProductBean pbean=new ProductBean();
    	  pbean.setPid(req.getParameter("pid"));
    	  pbean.setPname(req.getParameter("pname"));
    	  pbean.setPprice(Double.parseDouble(req.getParameter("pprice")));
    	  pbean.setPqty(Integer.parseInt(req.getParameter("pqty")));
    	  
    	 AddProductDAO obj= new AddProductDAO();
    	 int RowCount=obj.insertdata(pbean);
    	
    	 if(RowCount>0) 
    	 {
    		req.setAttribute("msg", "Product data inserted Successfully.....!<br><br>");
    		 RequestDispatcher rd=req.getRequestDispatcher("Display.jsp");
    		rd.forward(req, res);
    	 }
    	 else {
    		 req.setAttribute("msg", "Product data NOT inserted....!<br><br>");
    		 RequestDispatcher rd=req.getRequestDispatcher("Display.jsp");
    		rd.forward(req, res);
    	 }
      }
}
