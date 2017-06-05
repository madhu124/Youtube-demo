package Day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchUpdateDemo {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			
			Connection conn= DriverManager.getConnection("jdbc:Oracle:thin:@localhost:1521:xe","test","Oracle1234");
		
			   Statement st= conn.createStatement();
		
st.addBatch("insert into StudentNew values(101,'xyz',98)");
st.addBatch("update StudentNew set sname= 'charan' where sno=100");
int[] erno=st.executeBatch();
int effectedRows=0;
for(int i:erno){
	
	effectedRows+=i;
}
System.out.println("No of effected rows:" +effectedRows);		
		
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
	


