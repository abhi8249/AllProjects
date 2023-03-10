
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class StudentServer extends HttpServlet
{
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		int rl;
		rl=Integer.parseInt(req.getParameter("txtrl"));
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tiger");
			Statement st=con.createStatement();
			ResultSet rs= st.executeQuery("select * from Abinash.student where srl='"+rl+"'");
			if(rs.next())
			{
				pw.print("<html><body><center>");
				pw.print("<table>");
				pw.print("<tr>");
				pw.print("<td>Roll no</td>");
				pw.print("<td>"+rs.getInt(1)+"</td>");
				pw.print("</tr>");
				pw.print("<tr>");
				pw.print("<td>NAME</td>");
				pw.print("<td>"+rs.getString(2)+"</td>");
				pw.print("</tr>");
				pw.print("<tr>");
				pw.print("<td>Address</td>");
				pw.print("<td>"+rs.getString(3)+"</td>");
				pw.print("</tr>");
				pw.print("<tr>");
				pw.print("<td>Max</td>");
				pw.print("<td>Max</td>");
				pw.print("<td>"+rs.getInt(4)+"</td>");
				pw.print("</tr></table></body></html>");
			}
			else{
				pw.print("Sorry");
			}
		}
			catch(Exception e)
			{
				pw.print(e);
			}
	}
		}