<html>
<head>
<title>An example of simple model</title>
</head>
<body>
<center><Font color="blue" size="b">A listing of books</Font>
</center><br><br>
<%@page import="java.sql.*"%>
<table width=100% border="2" bgcolor="silver">
<tr>
<th width="50%">Name</th>
<th width="25%">Rolln0</th>
<th width="25%">Address</th>
</tr>

try
{
	Class.forName("oracle.jdbc.driver.oracleDriver">
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:xe","system","tiger");
	Statement st=con.CreateStatement();
	String sql="select * from abinash1.student";
	ResultSet rs=st.executableQuery(sql);
	while(rs.next())
	{
		%>
		<tr>
		<td><%=rs.getString(1)%></td>
		<td><%=rs.getInt(2)%></td>
		<td><%=rs.getString(3)%></td>
		</tr>
	<%
	}
	%>
	</table>
<%}
catch(Exception e)
{}
%>
</body>
</html>