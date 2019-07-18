
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class displaySGPA {
	public static void main(String[] args) throws SQLException {

		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;

		try {
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter Sem id for SGPA : ");
			int id = sc.nextInt();
			String sql = "select SGPA from demo.17it109 where SemId = "+id;
			
			myConn = DriverManager.getConnection(
					"jdbc:mysql://jdbcassignment.cetn2jthwfls.us-east-1.rds.amazonaws.com/demo", "root", "abcd1234");
			
			myStmt = myConn.createStatement();
			
			myRs = myStmt.executeQuery(sql);
			myRs.next();
			System.out.println(myRs.getString("SGPA"));

			

		} catch (Exception exc) {
			exc.printStackTrace();
		} finally {
			if (myRs != null) {
				myRs.close();
			}

			if (myStmt != null) {
				myStmt.close();
			}

			if (myConn != null) {
				myConn.close();
			}
		}
	}

}
