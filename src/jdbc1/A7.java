package jdbc1;

import java.util.Scanner;
import java.nio.file.spi.FileSystemProvider;
import java.sql.*;

public class A7 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
////		
//		//1. load and register the driver
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		
//		//2. Create connection
//		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/ashdb","root","root");
//	
////		//3. Create a statement 
////		Statement statement=connection.createStatement();
////		
////		//4. Execute Query
////		statement.execute("select name from employee where empId=1");
////		System.out.println("done");
////		
////		ResultSet resultSet=statement.executeQuery("SELECT * from employee");
////		while(resultSet.next()) {
////			System.out.println(resultSet.getInt(2));
////			System.out.println(resultSet.getString(1));
////			System.out.println(resultSet.getString("name"));
////		}
//		
//		// prepared statement
////		PreparedStatement preparedStatement= connection.prepareStatement("UPDATE employee set name=? where empId=7");
////		System.out.println("enetr name");
////		Scanner s=new Scanner(System.in);
////		String name=s.next();
////		
////		preparedStatement.setString(1,name);
////		preparedStatement.execute();
//
//		
//		// delete statement
////		PreparedStatement preparedStatement=connection.prepareStatement("select * from employee");
////		ResultSet resultSet= preparedStatement.executeQuery();
////		while(resultSet.next()) {
////			System.out.println(resultSet.getString("name"));
////			System.out.println(resultSet.getInt("empId"));
////			System.out.println(resultSet.getString("depName"));
////		}
//		// select statement
//		PreparedStatement preparedStatement=connection.prepareStatement("select * from employee");
//		Scanner s=new Scanner(System.in);
//		System.out.println("enter  id");
//		int id=s.nextInt();
//		
//		while(resultSet.next()) {
//			System.out.println(resultSet.getString("name"));
//			System.out.println(resultSet.getInt("empId"));
//			System.out.println(resultSet.getString("depName"));
//		}
//		
////		preparedStatement.execute();
////		
//		
//		
//		
//		
//		//5. Close a connection
//		connection.close();
//		System.out.println("done");
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//2. Create connection
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/ashdb","root","root");
	
		
		PreparedStatement	preparedstatement=connection.prepareStatement("delete from Employee where empId=?");
		
	
		int i=0;
		while(i<1) {
			Scanner sc=new Scanner(System.in);
			System.out.println("plz give id");
			int empId=sc.nextInt();
			preparedstatement.setInt(1,empId);
			preparedstatement.addBatch("deleted");
			i++;
		}
	
		preparedstatement.executeBatch();
		
		
		//5. Close a connection
		connection.close();
		System.out.println("done");

		
	
	}

}
