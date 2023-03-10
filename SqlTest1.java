import java.sql.*;
import java.util.*;
import java.io.*;
import java.sql.Driver.*;

class SqlTest1
{
	public static void main(String arg[])throws Exception
	{
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql:///db1","root","12345");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from student");

		while(rs.next())
		{
			System.out.println(rs.getString(1)+"   "+rs.getString(2)+"   "+rs.getString(3));
		}
		rs.close();
		st.close();
		con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
