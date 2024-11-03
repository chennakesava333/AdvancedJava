package pack1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@SuppressWarnings("serial")
@WebServlet("/ms")
public class MainServlet extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String userChoice=req.getParameter("choice");
		switch(userChoice) 
		{
		case "addition":
		{
			RequestDispatcher rd=req.getRequestDispatcher("ads");
			rd.forward(req, res);
			break;
		}
	case "subtraction":
	{
		RequestDispatcher rd=req.getRequestDispatcher("sub");
		rd.forward(req, res);
		break;
	}
	case "multiplication":
	{
		RequestDispatcher rd=req.getRequestDispatcher("multi");
		rd.forward(req, res);
		break;
	}
	case "division":
	{
		RequestDispatcher rd=req.getRequestDispatcher("div");
		rd.forward(req, res);
		break;
	}
	case "greater":
	{
		RequestDispatcher rd=req.getRequestDispatcher("gre");
		rd.forward(req, res);
		break;
	}
	
	}
	}

}
