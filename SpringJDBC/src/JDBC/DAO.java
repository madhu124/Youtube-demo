package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {

	
	public Circle getCircle(int id){
		
		Connection conn=null;
		
		
			try {
				String driver="oracle.jdbc.driver.OracleDriver";
				Class.forName(driver).newInstance();
			
				conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","test","Oracle1234");
			 PreparedStatement ps=conn.prepareStatement("SELECT * FROM CIRCLE WHERE ID=?");
			 ps.setInt(1, id);
			 
			 Circle circle=null;
			 ResultSet rs=ps.executeQuery();
			 if(rs.next()){
				 circle=new Circle(id,rs.getString("name"));
				 
			 }
			rs.close();
			ps.close();
			return circle;
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
