import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class extends HttpServlet
{
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		
		String nm,fnm,ad,ct,p1,p2;
		nm=req.getParameter("txt1");
		fnm=req.getParameter("txt2");
		ad=req.getParameter("txt3");
		ct=req.getParameter("txt4");
		p1=req.getParameter("txt5");
		p2=req.getParameter("txt6");
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tiger");
			PreparedStatement st=con.prepareStatement("insert into abinash1.logindb values(?,?,?,?,?)");
			if(p1.equals(p2))
			{
				st.setString(1,nm);
				st.setString(2,fnm);
				st.setString(3,ad);
				st.setString(4,ct);
				st.setString(5,p1);
				int x=st.executeUpdate();
				if(x!=0)
				{
					pw.print("thank you");
				}
				else
				{
					pw.print("Sorry");
				}
			}
		}
		catch(Exception e)
		{
			pw.print(e);
		}
	}
}
				
			