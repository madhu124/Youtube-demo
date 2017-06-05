
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentRegistration
 */
public class StudentRegistration extends HttpServlet {

	Connection con = null;
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public StudentRegistration() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		try {
			/*
			 * Class.forName("oracle.jdbc.driver.OracleDriver"); con=
			 * DriverManager.getConnection("jdbc:Oracle:thin:@localhost:1521:xe"
			 * ,"test","Oracle1234");
			 */
			String driver = config.getInitParameter("driver");
			String dburl = config.getInitParameter("dburl");
			String usd = config.getInitParameter("usd");
			String pwd = config.getInitParameter("pwd");
			Class.forName(driver);
			con = DriverManager.getConnection(dburl, usd, pwd);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

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
		try {

			PrintWriter pw = response.getWriter();
			response.setContentType("text/html");
			int no = Integer.parseInt(request.getParameter("sno"));
			String name = request.getParameter("sname");
			PreparedStatement ps = con.prepareStatement("insert into student values(?,?)");
			ps.setInt(1, no);
			ps.setString(2, name);
			int n = ps.executeUpdate();
			if (n != 0) {
				pw.println("record inserted");
				RequestDispatcher rd = request.getRequestDispatcher("/Register.html");
				rd.include(request, response);
			} else {
				pw.println("record not inserted please try again");

			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void destroy() {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
