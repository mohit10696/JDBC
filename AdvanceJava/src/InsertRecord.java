import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertRecord {
	public static void main(String [] args) throws SQLException
	{
		Connection myConn = null;
		PreparedStatement myStmt = null;
		ResultSet myRs = null;
		String URL = "jdbc:mysql://localhost/demo";
		String uname = "root";
		String pwd = "";
		myConn = DriverManager.getConnection(URL,uname,pwd);
		
		System.out.println("Database connection successfully!");
		myConn.setAutoCommit(false);
		myStmt = myConn.prepareStatement("INSERT INTO `17it109`(`SGPA`, `CGPA`, `class`) VALUES (?,?,?)");
		myStmt.setDouble(1, 9.44);
		myStmt.setDouble(2, 9.11);
		myStmt.setString(3,"IT");
		
		try {
			myStmt.execute();
		} catch (Exception e) {
			System.out.println("Problem");
		}
		myConn.commit();

		
	}
}
