package jdbc1;

import java.sql.*;
public class method2nd {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Driver driver=new com.mysql.cj.jdbc.Driver();
		
		DriverManager.registerDriver(driver);
		
//		Connection connection= DriverManager.getConnection("\"jdbc:mysql://localhost:3306/ashdb\",\"root\",\"root\"");
//		
//		PreparedStatement preparedStatement= connection.prepareStatement("insert into employee  values(?,?,?)");
//		
//		preparedStatement.setString(1,"riyaa");
//		preparedStatement.setInt(2,77);
//		preparedStatement.setString(3,"sql");
//		preparedStatement.execute();
//		connection.close();
//		System.out.println("done");
		
		// stored procedure
		
		Connection connection= DriverManager.getConnection("\"jdbc:mysql://localhost:3306/ashdb\",\"root\",\"root\"");
		CallableStatement collabaleStatement=connection.prepareCall("call selectUser()");
		ResultSet resultset=collabaleStatement.executeQuery();
		
		while(resultset.next()) {
			System.out.println(resultset.getString(1));
			System.out.println(resultset.getInt(2));
			System.out.println(resultset.getString(3));
			
		}
		connection.close();
;		

	}

}
