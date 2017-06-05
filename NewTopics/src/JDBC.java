
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Connection conn;
try{
Class.forName("oracle.jdbc.driver.OracleDriver");
}
catch(Exception e){
	e.getMessage();
}

try{
conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","test","Oracle1234");
Statement st=conn.createStatement();
String query="select * from BANKING";
ResultSet rs=st.executeQuery(query);

while(rs.next()){
	System.out.print(rs.getString(1));
	System.out.print("    ");
	System.out.print(rs.getString(2));
	System.out.print("    ");
	System.out.println(rs.getLong(3));
}
}

catch(SQLException e){
	e.printStackTrace();
}

//System.out.println("connection created....");
	}

}
