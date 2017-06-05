package Day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class preparedStatmnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection conn = DriverManager.getConnection("jdbc:Oracle:thin:@localhost:1521:xe", "test", "Oracle1234");

			PreparedStatement ps = conn.prepareStatement("insert into StudentNew values(?,?,?)");

			ps.setInt(1, 103);
			ps.setString(2, "vakula");
			ps.setInt(3, 87);
			int n = ps.executeUpdate();
			
			if (n != 0) {
				System.out.println("Succesfully one record updated");
			} else {
				System.out.println("record not updated");
			}
			
			
			
			
			
			/*ResultSet rs = ps.executeQuery("select * from StudentNew");

			ResultSetMetaData rsmd = rs.getMetaData();

			System.out.println(rsmd.getColumnName(1) + "\t" + rsmd.getColumnName(2) + "\t" + rsmd.getColumnName(3));

			while (rs.next()) {

				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3));

			}*/

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
