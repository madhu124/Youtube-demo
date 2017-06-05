package pakage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DisplayServlet
 */
public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayServlet() {
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
		PrintWriter pw=response.getWriter();
		
		//Get the details
		String gender=request.getParameter("gender");
		String mobile=request.getParameter("mobile");
		String email=request.getParameter("email");
		
		//Httpservlet
		HttpSession session= request.getSession(false);
		session.setAttribute("mobile", mobile);
		session.setAttribute("email", email);
		pw.println("<br><br>");
		pw.println("You have successfully submitted ");
		pw.println("<br><br><br>");
		pw.println("UserName is " + session.getAttribute("name"));
		pw.println("<br><br>");
		pw.println("password is " + session.getAttribute("pwd"));
		pw.println("<br><br>");
		pw.println("Qualification  is " + session.getAttribute("quali"));
		pw.println("<br><br>");
		pw.println("designation is " + session.getAttribute("desig"));
		pw.println("<br><br>");
		pw.println("gender is " + gender);
		pw.println("<br><br>");
		pw.println("age is " + session.getAttribute("age"));
		pw.println("<br><br>");
		pw.println("Mobile no is " + mobile);
		pw.println("<br><br>");
		pw.println("email is " + email);
		pw.println("<br><br>");
		
		
		
		
		
		
		
		
		
	}

}
