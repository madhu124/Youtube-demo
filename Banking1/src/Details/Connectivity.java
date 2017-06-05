package Details;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connectivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
Connection conn;
 try {
	 conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","test","Oracle1234");
	
	Statement stmt=conn.createStatement();
	String query= "select * from BANKING";
	ResultSet rs=stmt.executeQuery(query);	
	while(rs.next()){
		System.out.print(rs.getString(1));
		System.out.print("  ");
		System.out.print(rs.getString(2));
		System.out.print("  ");
		System.out.println(rs.getLong(3));


	}
	
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}

}
