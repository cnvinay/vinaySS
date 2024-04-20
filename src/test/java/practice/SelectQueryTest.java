package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class SelectQueryTest {
public static void main(String[] args) throws SQLException {
	//step1- register driver   
	     Driver driver= new Driver();             // cj.jdbc
	     DriverManager.registerDriver(driver); 
	     
	     
	//step2-  get connection for database
	   Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sdet55", "root", "root");   //(select 3parameter url, username, password)
	    		// jdbc:mysql://localhost:3306/mysql -->change mysql db to our db (sdet55)
	    		
	//step3- create statement
	    Statement state = conn.createStatement();
	    String query = " select * from rmg; "; 
	  // String query = " select * from rmg where name='vinay'; "; 
	   
	   //String query = " select name, subject from rmg where name='vinay'; "; 
	    
	//step4-  executeQuery
	   ResultSet result = state.executeQuery(query);
	   //without while
//	 result.next();
//	 System.out.println(result.getString(1)+ "  "+result.getString(2));
	    while(result.next())
	    {
	    	System.out.println(result.getString(1)+ "  "+result.getString(2)+"  "+result.getString(3)); // alldata
	   
	    	//System.out.println(result.getString("subject")+ " "+ result.getString("name")); // filtering
	    }   
	    
	//step5- close database connection
	     conn.close();
}
}
