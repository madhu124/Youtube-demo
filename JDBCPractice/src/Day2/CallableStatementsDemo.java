package Day2;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CallableStatementsDemo {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			
			Connection conn= DriverManager.getConnection("jdbc:Oracle:thin:@localhost:1521:xe","test","Oracle1234");
		
			   CallableStatement st= conn.prepareCall(" ");
		

		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}



	}


