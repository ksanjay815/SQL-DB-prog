package Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.xdevapi.AddStatement;

public class Sql2 {
	    private static String url="jdbc:mysql://localhost:3306/HDFC";
    	private static String user=	"root";
    	private static String pswd="root";
public static void main(String[] args) throws SQLException {
try{
	Connection con=DriverManager.getConnection(url, user,pswd);		
	Statement createStatement = con.createStatement();;
String data ="INSERT INTO Customers values(1,'sravan',22,'gurirevu','hyderabad')"; 
String data1= "INSERT INTO Customers values(2,'neveen',23,'kphb','hyd')"; 
String data2="UPDATE table_Customers"
		+ "SET column1 = value1, column2 = value2, "
		+ "WHERE condition;(3,'balu',24,'hiyathnagar','warangal')"; 
String data3="INSERT INTO Customers values(4,'siva',25,'jntu','hyderabad')"; 
String data4= "INSERT INTO Customers values(5,'uma',26,'kondapur','hyderabad')"; 
String data5= "INSERT INTO Customers values(6,'hari',27,'kondapur','hyderabad')"; 
String data6= "INSERT INTO Customers values(7,'pawan',28,'kondapur','hyderabad')"; 
createStatement.executeUpdate(data);
createStatement.executeUpdate(data2);
createStatement.executeUpdate(data3);
createStatement.executeUpdate(data4);
createStatement.executeUpdate(data5);
createStatement.executeUpdate(data6);
System.out.println("Data inserted into table");

}catch(SQLException e) { 
	e.printStackTrace();
}

}}
