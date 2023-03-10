import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class DisplayImage extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		res.setContentType("image/jpeg");
		ServletOutputStream out;
		out=res.getOutputStream();
		FileInputStream fis=new FileInputStream("C:\\Image\\Abhi.jpg");
		BufferedInputStream bin=new BufferedInputStream(fis);
		BufferedOutputStream bout= new BufferedOutputStream(out); 
		int ch;
		while((ch=bin.read())!=-1)
		{
			bout.write(ch);
		}
		bin.close();
		fis.close();
		bout.close();
		out.close();
	}
}