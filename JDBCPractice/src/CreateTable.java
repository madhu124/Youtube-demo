import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Connection conn= DriverManager.getConnection("jdbc:Oracle:thin:@localhost:1521:xe","test","Oracle1234");
		
			Statement st = conn.createStatement();
			
		 boolean result=st.execute("create table StudentNew(sno number(10), sname varchar2(30), marks number(3))");

if(result){
	System.out.println("table created successfully");
}
else System.out.println("table not created,please check again");
		
		
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

}
