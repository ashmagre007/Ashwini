package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class executequery {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//1. load and register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//2. Create connection
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/ashdb","root","root");
	
		//3. Create a statement 
		Statement statement=connection.createStatement();
		
		//4. Execute Query
		ResultSet resultSet=statement.executeQuery("SEECT * from employee");
		
		//5. Close a connection
		connection.close();
		System.out.println("done");

}
}
