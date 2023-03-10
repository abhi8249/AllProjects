<HTML>
    <BODY>
        <link rel="stylesheet" href="indexjsp.css">
      <%@ page import="java.sql.*"%>

    <%
    String nm,email,phonenumber,password;

    nm=request.getParameter("firstname");
    email=request.getParameter("email");
    phonenumber=request.getParameter("number");
    password=request.getParameter("password");
   try{
    Class.forName("oracle.jdbc.driver.OracleDriver");
    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","abinash");
    PreparedStatement ps=con.prepareStatement("insert into spotify.mymusic(name,email,phno,password) values(?,?,?,?)");
   ps.setString(1,nm);
   ps.setString(2,email);
   ps.setString(3,phonenumber);
   ps.setString(4,password);
   int x=ps.executeUpdate();
if(x>0)
{
    out.println("<h2>REGISTERED THANK YOU!</h2>");
}
else{
    out.println("failed");
}
   }
   catch(Exception e)
   {
    out.println(e);
   }
    %>
    </BODY>
    </HTML>
    
    