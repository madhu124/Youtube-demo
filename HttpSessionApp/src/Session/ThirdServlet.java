package Session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ThirdServlet
 */
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ThirdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	response.setContentType("text/html");
	
	String mobile=request.getParameter("mobile");
	String email=request.getParameter("email");
	
	HttpSession session=request.getSession(false);	
	
	//print all details of client 4 from previous 2 from this 
	PrintWriter writer=response.getWriter();
	writer.println("<br><br>");
	writer.println("username is " + session.getAttribute("uname"));
	writer.println("<br><br>");
	writer.println("userage  is " + session.getAttribute("uage"));
	writer.println("<br><br>");
	writer.println("user qualification is " + session.getAttribute("uquali"));
	writer.println("<br><br>");
	writer.println("user designation is " + session.getAttribute("userdig"));
	writer.println("<br><br>");
	writer.println("mobile number is " +mobile);
	writer.println("<br><br>");
	writer.println("email id is " + email);
	writer.println("<br><br>");
	
	
	}

}
