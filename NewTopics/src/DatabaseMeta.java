import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseMeta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
Connection con;
try {
	con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","test","Oracle1234");
	Statement stmt=con.createStatement();
	/*DatabaseMetaData dbmd=con.getMetaData();
	System.out.println("Drivaer name is " + dbmd.getDriverName());
	System.out.println("product name is " + dbmd.getDatabaseProductName());
	System.out.println("product version is " + dbmd.getDatabaseProductVersion());
	System.out.println("Drivaer version is " + dbmd.getDriverVersion());*/


	ResultSet rs=stmt.executeQuery("select * from student");
	ResultSetMetaData rsmd=rs.getMetaData();
System.out.println(rsmd.getColumnTypeName(1));
System.out.println(rsmd.getColumnCount());
System.out.println(rsmd.getColumnName(1));

	while(rs.next()){
		System.out.print(rs.getInt(1));
		System.out.print(rs.getString(2));
		System.out.println(rs.getString(3));
	}
	
	
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}
