import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Types;

public class JDBC1 {

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

/*Statement st=conn.createStatement();
ResultSet rs=st.executeQuery("select * from employee ");
while(rs.next()){
	System.out.print(rs.getInt(1));
	System.out.print("    ");
	System.out.print(rs.getString(2));
	System.out.print("    ");
	System.out.println(rs.getInt(3));
}
Statement st1=conn.createStatement();
//String update="update employee set salary=101 where name='emp1'";
String delete="delete employee where id=101";
int noOfRows=st1.executeUpdate(delete);
System.out.println(noOfRows);*/

String pQuery="select * from employee where id = ?";
PreparedStatement pstmt=conn.prepareStatement(pQuery);
pstmt.setInt(1, 100);
ResultSet rs1=pstmt.executeQuery();
while(rs1.next()){
	System.out.print(rs1.getInt("id"));
	System.out.print("    ");
	System.out.print(rs1.getString("name"));
	System.out.print("    ");
	System.out.println(rs1.getInt("salary"));
}
	
	/*String csql="{?=call Function2()}";
	CallableStatement cstmt=conn.prepareCall(csql);
	cstmt.registerOutParameter(1, Types.VARCHAR);
	cstmt.execute();
	System.out.println(cstmt.getString(1));
	*/
	


}
catch(Exception e){
	e.printStackTrace();
}
System.out.println("connection created");
	}

}
