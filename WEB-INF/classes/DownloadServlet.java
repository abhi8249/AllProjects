import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class DownloadServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
	res.setContentType("text/html");
	PrintWriter pw= res.getWriter();
	String filename="login.html";
	String path="C:\\";
	res.setContentType("APPLICATION/OCTET-STREAM");
	//res.setHeader("content-Disposition","attachment;Login=\",+"Login"\"");
	FileInputStream fis=new FileInputStream("C:\\login.html");
	int i;
	while((i=fis.read())!=-1)
	{
		pw.write(i);
	}
	fis.close();
	}
}

	