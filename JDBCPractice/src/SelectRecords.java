import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectRecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection conn = DriverManager.getConnection("jdbc:Oracle:thin:@localhost:1521:xe", "test", "Oracle1234");

			Statement st = conn.createStatement();

			ResultSet rs = st.executeQuery("select * from StudentNew");
			
			ResultSetMetaData rsmd = rs.getMetaData();
			
			
			System.out.println(rsmd.getColumnName(1)+"\t" + rsmd.getColumnName(2)+"\t"+ rsmd.getColumnName(3));
			
			
			
			while (rs.next()) {

				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3));

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
