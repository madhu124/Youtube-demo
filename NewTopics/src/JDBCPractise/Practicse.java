package JDBCPractise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Practicse {
 public static void main(String[] args){
	 
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
		
		String query="select * from EMPLOYEE";
		String query1="insert into employee values(?,?,?)";
		PreparedStatement psmd=conn.prepareStatement(query1);
		psmd.setInt(1,107);
		psmd.setString(2, "emp10");
		psmd.setInt(3, 2349);
		ResultSet rs1=psmd.executeQuery();
		/*while(rs1.next()){
			System.out.print(rs1.getInt("id"));
			System.out.print("  ");
			System.out.print(rs1.getString("name"));
			System.out.print("  ");

			System.out.println(rs1.getInt("salary"));

		}*/		
		PreparedStatement psmd1=conn.prepareStatement(query);
		ResultSet rs=psmd1.executeQuery(query);

		while(rs.next()){
			System.out.print(rs.getInt(1));
			System.out.print("    ");
			System.out.print(rs.getString(2));
			System.out.print("    ");
			System.out.println(rs.getString(3));
		}

	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }
}
