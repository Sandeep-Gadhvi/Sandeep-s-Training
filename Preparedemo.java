import java.sql.*;
import java.util.*;
public class Preparedemo
{
public static void main(String[]args) throws Exception
{
System.out.println("Enter the rno and name");
Scanner sc = new Scanner(System.in);
int id =sc.nextInt();
String name = sc.next();

//Loading Driver
Class.forName("com.mysql.jdbc.Driver");

//Providing Connection
Connection con=DriverManager.getConnection("jdbc:demo://localhost:3309/demo","root","root");
String data="insert into test values(?,?)";
PreparedStatement ps=con.prepareStatement(data);
ps.setInt(1,id);
ps.setString(2,name);
ps.executeUpdate();
System.out.println("Record Inserted");
ps.close();
con.close();
}
}