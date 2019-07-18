import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SchemaCreation {
	public static void main(String [] args) throws SQLException
	{
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		String URL = "jdbc:mysql://jdbcassignment.cetn2jthwfls.us-east-1.rds.amazonaws.com/demo";
		String uname = "root";
		String pwd = "abcd1234";
		myConn = DriverManager.getConnection(URL,uname,pwd);
		System.out.println("Database connection successfully!");
		
		myStmt = myConn.createStatement();
		
		String quary = "CREATE TABLE demo.17it109 (\r\n" + 
				" SemId INT NOT NULL AUTO_INCREMENT primary key,\r\n" + 
				" SGPA DECIMAL(10,2) not null,\r\n" + 
				" CGPA DECIMAL(10,2) DEFAULT NULL,\r\n" + 
				"class varchar(10) not null)";
		
		boolean tableCreated = myStmt.execute(quary);
		if(!tableCreated)System.out.println("Table Created!");
	}
}
