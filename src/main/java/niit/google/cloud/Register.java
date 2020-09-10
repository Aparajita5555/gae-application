package niit.google.cloud;

import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class Register extends HttpServlet
{
	Dao dobj=new Dao();
	public void doPost(HttpServletRequest req, HttpServletResponse res)
	{
		
		int row=0;
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		
		try {
			PrintWriter out=res.getWriter();
			row=dobj.register(name, email, password);
			if(row>0)
			{
				//out.println("Registration successful");
				System.out.println("hello7");
				res.sendRedirect("login.jsp");
				System.out.println("hello6");
			}
		}
		catch(Exception ex)
		{
			System.out.println("Exception occured 2 "+ex);
		}
		
	}
}
