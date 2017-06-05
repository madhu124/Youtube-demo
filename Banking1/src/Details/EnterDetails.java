package Details;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class EnterDetails
 */
public class EnterDetails extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		response.setContentType("text/html");
		String Fname=request.getParameter("Fname");
		String mobile=request.getParameter("mobile");
		
		/*HttpSession session=request.getSession();
		session.setAttribute("Fname",Fname);
		session.setAttribute("mobile", mobile);
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("Connectivity.java");
		dispatcher.forward(request, response);*/
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
Connection conn;
PrintWriter pw=response.getWriter();
 try {
	 conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","test","Oracle1234");
	
	Statement stmt=conn.createStatement();
	String query= "select * from BANKING";
	ResultSet rs=stmt.executeQuery(query);	
	String	name=rs.getString(1);
	String	Lastname=rs.getString(2);
	
	while(rs.next()){
		pw.print(rs.getString(1));
		pw.print("  ");
		pw.print(rs.getString(2));
		pw.print("  ");
		pw.println(rs.getLong(3));


	}
	if(name.equals(Fname)){
		pw.println("lastname is " +Lastname);
		
	}
	
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	
	

	}

}
