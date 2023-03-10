<HTML>
<BODY>
<%
String nm,pw;
nm=request.getParameter("txtnm");
pw=request.getParameter("txtpw");
if(pw.equals("cac"))
{
	out.println("hello"+nm);
}
else{
	out.println("wrong password");
}
%>
</BODY>
</HTML>

