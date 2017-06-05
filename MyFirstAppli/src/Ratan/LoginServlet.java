package Ratan;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		// general settings
		PrintWriter pw=response.getWriter();
		pw.println("This is my application");
		pw.println("<br>");
		pw.println("this is get request");
		
		//request data gathering
String uname=request.getParameter("uname");
String upass=request.getParameter("upass");

//business logic
if(uname.equals("Vakula")&& upass.equals("varam")){
	pw.println("login successfull");
}
else{
	pw.println("login failed");
}
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
