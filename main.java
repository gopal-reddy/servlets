
import java.sql.*;
class main
{
public static void main(String args[])
{
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection conn = null;
conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testtable","root", "");
System.out.print("Database is connected !");
conn.close();
}
catch(Exception e)
{
System.out.print("Do not connect to DB - Error:"+e);
}
}
}