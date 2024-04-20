package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class NonSelectQueryTest {
public static void main(String[] args) throws SQLException {
	//step-1 register driver
	Driver driver= new Driver();
	DriverManager.registerDriver(driver);
	
	//step-2 get connection for database
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sdet55", "root", "root");
	
	//step-3 create statement
	Statement state = conn.createStatement();
	String query = "insert into rmg values('radha', 'api', 1);";
	
	//step-4 execute query
	int result = state.executeUpdate(query);
	
	
//step-5 close database connection
	
	conn.close();
}
}
