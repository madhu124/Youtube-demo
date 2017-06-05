package BankDetails;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Personal
 */
public class Personal extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		String Fname=request.getParameter("Fname");
		String mobile=request.getParameter("mobile");
		
	PrintWriter pw=response.getWriter();
		

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



//Updating 
/*
String query= "INSERT INTO BANKING VALUES(?,?,?)";
PreparedStatement psmd=conn.prepareStatement(query);
psmd.setString(1, "Ram");
psmd.setString(2, "Neeru");
psmd.setLong(3, 345679);*/

/*String	name=rs.getString(1);
String	Lastname=rs.getString(2);
long dmobile=rs.getLong(3);

while(rs.next()){
	System.out.print(rs.getString(1));
System.out.print("  ");
System.out.print(rs.getString(2));
System.out.print("  ");
System.out.println(rs.getLong(3));



}
int i=psmd.executeUpdate();
if(i>0){
	pw.println("  ");
pw.println("Succesfulluy logged In");
}
*/
pw.println(" <Style>body {background-color:pink; text-align:center;}</Style>");
pw.println("Input firstname is "+Fname+"<br><br>");
pw.print("  ");
pw.println("Input Mobilenumber is "+mobile+ "<br><br>");	
String query1="SELECT * FROM BANKING WHERE FIRSTNAME=?";
PreparedStatement psmd=conn.prepareStatement(query1);
psmd.setString(1, Fname);
ResultSet rs=psmd.executeQuery();
while(rs.next()){
pw.println(rs.getDouble("AMOUNT")+"<br><br>");
pw.println(rs.getLong("MOBILENUMBER")+"<br><br>");
pw.println( "FirstName is "+Fname+"<br><br>"+" LastName is "+rs.getString(2)+"<br><br>");
}

//ResultSet rs=stmt.executeQuery("SELECT AMOUNT FROM BANKING WHERE FIRSTNAME='Fname'");	

/*while(rs.next()){
	pw.println("You hace Succesfully LoggedIn");
	pw.println("<br><br>");
pw.println( "FirstName is "+Fname+"<br><br>"+" LastName is "+rs.getString(2)+"<br><br>"+" MobileNumber is " +mobile+"Amount is " +rs.getInt(4));
}
}
else{
	pw.println(" <Style>body {background-color:black;color:yellow;text-align:center;font-size:30px;}</Style>");
	pw.println("SORRY please try again");

}*/
} catch (Exception e) {
// TODO Auto-generated catch block
e.printStackTrace();
}


}


		
		
	}


	

