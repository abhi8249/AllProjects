
import java.io.*;
import java.sql.*;
class Music
{
    Connection con;
	Statement stmt;
    public void dbConnect()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","abinash");
		}
		catch(Exception ie)
		{
			System.out.println(ie);
		}
	}
    public void addRecord(){
       String name,email;
       String date;
       long phoneNumber;
       String password;
       try
		{
			dbConnect();
            name="soumya";
            email="hii";
            phoneNumber=824905391;
            password="Abhi8249";
			stmt=con.createStatement();
			int x=stmt.executeUpdate("insert into spotify.mymusic values('"+name+"','"+email+"','"+phoneNumber+"','"+password+"')");
         }
        catch(Exception e)
		 {
			System.out.println(e);
		 }
   }
}
public class Spotify {
  public static void main(String[] args) {
    Music m = new Music();
 m.addRecord();
  }
}
