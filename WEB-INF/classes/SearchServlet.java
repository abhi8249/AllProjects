import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class SearchServlet extends HttpServlet
{
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		String st;
		st=req.getParameter("txt1");
		res.sendRedirect("https://www.google.co.in/search?q="+st);
	}
}