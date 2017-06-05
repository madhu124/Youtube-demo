package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WelcomeClass extends HttpServlet{
public void service(HttpServletRequest request,HttpServletResponse response){
	System.out.println("this my welcome class");
	String search=request.getParameter("SEARCH");
	if(search==null){
		search="0";
	}
	
		try {
			if(search.equals("100")){
			response.sendRedirect("http://localhost:9093/MyWebAppli/hello");
			}
			else if(search.equals("2")){
				response.sendRedirect("https://www.google.com/");
			}
			else if(search.equals("3")){
				//to display urls in same localhost we can use request dispatcher also
				RequestDispatcher rd=getServletContext().getRequestDispatcher("/hello");
				try {
					rd.forward(request, response);
					
					/*the only difference between requestDispatcher and response send redirect is urls 
					 * for response the url changes to new url
					 * where as for the requestdispatcher  url doesnt changes.
					 * 
					 */
				} catch (ServletException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else {
				PrintWriter pw=response.getWriter();
				pw.println("<h1> hello from first class");
				pw.close();
				pw.flush();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
	}
}
}
