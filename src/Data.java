import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class Data {

	public static void main(String[] args) throws SQLException {
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/idbi","root","root");
Statement createStatement= con.createStatement();
String data="INSERT INTO Persons values(23,'kcr thataa',67,'panjagutta',420)";
 createStatement.executeUpdate(data);
con.close();
System.out.println("ok");
	
	
	}

}
