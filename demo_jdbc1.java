import java.sql.*;

public class demo_jdbc1 {
	public static void main(String args[])throws Exception
	{
	//Loading Driver
	Class.forName("com.mysql.jdbc.Driver");

	//Providing Connection 
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3309/demo","root","root");

	//Using Statement Interface
	Statement st=con.createStatement();

	//processing query using statement method
	st.execute("create table test(id int)");
	System.out.println("Table Created");

	//closing objects
	st.close();
	con.close();
	}
}
