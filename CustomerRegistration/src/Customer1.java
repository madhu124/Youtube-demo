
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Customer1
 */
public class Customer1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Customer1() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		Connection con = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "test", "Oracle1234");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		String uname = request.getParameter("uname");
		String lname = request.getParameter("Lname");
        String email = request.getParameter("email");
		Long mobile = Long.parseLong(request.getParameter("phone"));
		int age = Integer.parseInt(request.getParameter("age"));
		String button=request.getParameter("Register");
		

		if (button.equals("Register")) {

			/*HttpSession session = request.getSession();
			session.setAttribute("uname", uname);
			session.setAttribute("email", email);
			session.setAttribute("lname", lname);*/

			try {
				PreparedStatement ps = con.prepareStatement("INSERT INTO CUSTOMER VALUES(?,?,?,?,?)");
				ps.setString(1, uname);
				ps.setString(2, lname);
				ps.setString(3, email);
                ps.setLong(4, mobile);
				ps.setInt(5, age);
				int n=ps.executeUpdate();
				if(n!=0){
					pw.println("Sucessfully inserted");
				}
				else{
					pw.println("please try again");
					RequestDispatcher rd = request.getRequestDispatcher("Index.html");
					rd.forward(request, response);

				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			
		} else {

			try {
				PreparedStatement ps = con.prepareStatement("SELECT * FROM CUSTOMER WHERE UNAME=?");
				ps.setString(1, uname);
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					pw.println("FirstName is " + rs.getString(1) + "</br>");
					pw.println("LastName is " + rs.getString(2) + "</br>");
					pw.println("Email-Id is " + rs.getString(3) + "</br>");
					pw.println("Mobile-no is " + rs.getLong(4) + "</br>");
					pw.println("age is " + rs.getInt(5) + "</br>");


				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
