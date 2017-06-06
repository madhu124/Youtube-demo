package includeAndforward;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	response.getWriter().append("Served at: ").append(request.getContextPath());
	response.setContentType("text/html");
	PrintWriter writer=response.getWriter();
	
	String uname=request.getParameter("uname");
	String password=request.getParameter("upwd");
	if(uname.equals("varam")&& password.equals("9271")){
	RequestDispatcher dispatcher=request.getRequestDispatcher("SuccessServlet");
	dispatcher.forward(request, response);
	}
	else{
		writer.println("oops! login failed try with valid username and password");
		writer.println("<br><br>");
	
	RequestDispatcher dispatcher=request.getRequestDispatcher("login.html");
	dispatcher.include(request,response);
	
	}
	
}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
