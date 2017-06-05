import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection conn = DriverManager.getConnection("jdbc:Oracle:thin:@localhost:1521:xe", "test", "Oracle1234");

			Statement st = conn.createStatement();

			int n = st.executeUpdate("update StudentNew set sname='vakula' where sno=100");
			if (n != 0) {
				System.out.println("Succesfully one record updated");
			} else {
				System.out.println("record not updated");
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
