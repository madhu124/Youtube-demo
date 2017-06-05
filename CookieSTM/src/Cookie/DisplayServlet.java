package Cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		PrintWriter writer=response.getWriter();		
		
		
		String mobile=request.getParameter("mobile");
		String email=request.getParameter("email");
		
		 Cookie cookie5=new Cookie("mobile",mobile) ;
		 Cookie cookie6=new Cookie("email",email) ;
		 
		 response.addCookie(cookie5);
	    response.addCookie(cookie6);
	    
	    // cookies in an array
	    
	    Cookie[] c=request.getCookies();
	
	    writer.println("<br><br>");

	   writer.println( "username is "+c[0].getValue());
	   writer.println("<br><br>");
	   writer.println( "Age is "+c[1].getValue());
	   writer.println("<br><br>");
       writer.println( "Designation is "+c[2].getValue());
	   writer.println("<br><br>");

	   writer.println( "qualification is "+c[3].getValue());
	   writer.println("<br><br>");

	   writer.println( "mobile number is "+c[4].getValue());
	   writer.println("<br><br>");

	   writer.println( "email id is "+c[5].getValue());	   
	   writer.println("<br><br>");


	    }
	

}
