package jdbc1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;


public class batchExecution {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
			
			//1. load and register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2. Create connection
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/ashdb","root","root");
		
			//3. Create a statement 
		PreparedStatement	preparedstatement=connection.prepareStatement("delete from employee where empId=?");
			
			//4.
			int i=0;
			while(i<1) {
				Scanner sc=new Scanner(System.in);
				System.out.println("plz give id");
				int id=sc.nextInt();
				preparedstatement.setInt(1,id);
				preparedstatement.addBatch("added");
				i++;
			}
		
			preparedstatement.executeBatch();
			
			
			//5. Close a connection
			connection.close();
			System.out.println("done");

	}
	}
}
