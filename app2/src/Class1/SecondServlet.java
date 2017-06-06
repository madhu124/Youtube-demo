package Class1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response){
		response.setContentType("text/html");
		
		try {
			PrintWriter pw=response.getWriter();
			
			ServletConfig config=this.getServletConfig();
			String dog=config.getInitParameter("dog");
			String cat=config.getInitParameter("cat");

			pw.println("*********init paramaters***********");
			
			pw.println("<br>");
			pw.println("first init parameter dog " + dog);
			pw.println("<br>");
			pw.println("second init parameter cat" + cat);
			pw.println("<br>");
           ServletContext context=config.getServletContext();
           
           String username=context.getInitParameter("username");
           String password=context.getInitParameter("password");
           
           pw.println("*********Context parameters********");
           pw.println("<br>");
			pw.println("first context parameter " + username);
			pw.println("<br>");
			pw.println("second context parameter " + password);
			pw.println("<br>");

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

	
}
