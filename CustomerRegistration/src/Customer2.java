

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Customer2
 */
public class Customer2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Customer2() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		Connection con=null;
		PrintWriter pw= response.getWriter();
		response.setContentType("text/html");
		String lname = request.getParameter("Lname");
        String email = request.getParameter("email");
		Long mobile = Long.parseLong(request.getParameter("phone"));
		int age = Integer.parseInt(request.getParameter("age"));
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "test", "Oracle1234");
			
			PreparedStatement ps = con.prepareStatement("INSERT INTO CUSTOMER VALUES(?,?,?,?)");
			ps.setString(1, lname);
			ps.setString(2, email);

			ps.setLong(3, mobile);
			ps.setInt(4, age);
			ps.executeUpdate();
			
				pw.println("You have been registered succesfully");
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
