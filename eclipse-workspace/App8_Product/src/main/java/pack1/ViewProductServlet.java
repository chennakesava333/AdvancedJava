package pack1;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pack1.ProductBean;

@WebServlet("/view")
public class ViewProductServlet extends HttpServlet
{
   protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
   {
	   ViewProductDAO obj=new ViewProductDAO();
	   ArrayList<ProductBean>al=obj.reterive();
	   
	   req.setAttribute("List", al);
  	    RequestDispatcher rd=req.getRequestDispatcher("ViewProduct.jsp");
  	    rd.forward(req, res);
   }
}
