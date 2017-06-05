package NewDetails;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServerrConn
 */
public class ServerrConn extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServerrConn() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		

		 String name=request.getParameter("Fname");
		 String Lastname=request.getParameter("Lname");
		 
		 Connection con;
		 
		PrintWriter pw=response.getWriter();
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection( "jdbc:oracle:thin:@localhost:1521:xe","test","Oracle1234"); 
			
			Statement stmt=con.createStatement();
			String query="SELECT * FROM BANKING";
			ResultSet rs=stmt.executeQuery(query);
			
			while(rs.next()){
				
				
				pw.println(rs.getString(1));
			}
			
				}
		catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
		}
		// TODO Auto-generated method stub
	}

}
