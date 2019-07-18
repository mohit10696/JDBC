import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AlterTable {
	public static void main(String [] args) throws SQLException
	{
		Connection myConn = null;
		PreparedStatement myStmt = null;
		ResultSet myRs = null;
		String URL = "jdbc:mysql://jdbcassignment.cetn2jthwfls.us-east-1.rds.amazonaws.com/demo";
		String uname = "root";
		String pwd = "abcd1234";
		myConn = DriverManager.getConnection(URL,uname,pwd);
		
		System.out.println("Database connection successfully!");
		myConn.setAutoCommit(false);
		myStmt = myConn.prepareStatement("ALTER TABLE `17it109` ADD COLUMN `marksheet` blob");
		try {
			myStmt.execute();
		} catch (Exception e) {
			
			System.out.println("Problem"+e.getMessage());
		}
		myConn.commit();

		
	}
}
