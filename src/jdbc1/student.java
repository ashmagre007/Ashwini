package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class student {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/ashdb","root","root");
//		PreparedStatement preparedStatement= connection.prepareStatement("INSERT INTO employee(name,empId,depName) values(?,?,?) ");
//		
		PreparedStatement preparedStatement= connection.prepareStatement("UPDATE employee set name=? WHERE empId=?");
		
//		ResultSet resultSet= preparedStatement.executeQuery();
//	while(resultSet.next()) {
//		System.out.println(resultSet.getString("name"));
//		System.out.println(resultSet.getInt("empId"));
//		System.out.println(resultSet.getString("depName"));
//	}
		preparedStatement.setString(1,"ashwini");
		preparedStatement.setInt(2,70);
//		preparedStatement.setString(3,"history");
		preparedStatement.executeUpdate();
		System.out.println("done");
	}

}
