package niit.google.cloud;

import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class Login extends HttpServlet
{  
	Dao dobj=new Dao();
	public void doPost(HttpServletRequest req, HttpServletResponse res)
	{
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		try
		{
		String nm =dobj.signIn(email, password);
		if(nm!=null)
		{
			HttpSession session=req.getSession();
			session.setAttribute("email", email);
			session.setAttribute("password", password);
			session.setAttribute("name", nm);
			req.getRequestDispatcher("welcome.jsp");
		res.sendRedirect("welcome.jsp");
		System.out.println("hello8");
			
			//req.getRequestDispatcher("welcome.jsp");
		}
		else
		{
			PrintWriter out=res.getWriter();
			out.println("Invalid credentials"); 
			
		}
		}
		catch(Exception ex)
		{
			System.out.println("exception occured: "+ex);
		}
	
	}
}
