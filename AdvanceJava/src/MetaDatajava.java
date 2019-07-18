import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MetaDatajava {

	public static void main(String[] args) throws SQLException {

		Connection myConn = null;

		try {

			myConn = DriverManager.getConnection(
					"jdbc:mysql://jdbcassignment.cetn2jthwfls.us-east-1.rds.amazonaws.com/demo", "root", "abcd1234");

			System.out.println("Product name: " + myConn.getMetaData().getDatabaseProductName());
			
		} catch (Exception exc) {
			exc.printStackTrace();
		} finally {
			close(myConn);
		}
	}

	private static void close(Connection myConn)
			throws SQLException {

		if (myConn != null) {
			myConn.close();
		}
	}
}