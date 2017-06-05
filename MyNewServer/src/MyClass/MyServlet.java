package MyClass;

import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet  extends HttpServlet{
	//public void service(HttpServletRequest request, HttpServletResponse response){

		//System.out.println("welcome");
	public void doPost(HttpServletRequest request, HttpServletResponse response)	{
		PrintWriter writer; 
		
		try{
			writer=response.getWriter();
			writer.println("welcome");
			
			String uname=request.getParameter("uname");
			String upass=request.getParameter("upwd");
			
			
			if(uname.equals("vakula") && upass.equals("9271")){
				writer.println("login successfull");
				
				/*RequestRedirection mechanism
				   
				   
Request-Redirect using Hyperlink
				   
				/writer.println("<a href= 'https://www.facebook.com'>click here to RD to facebook</>");
				
				
request redirect using header and status
				/*response.setStatus(HttpServletResponse.SC_MOVED_PERMANENTLY);
			    response.setHeader("Location", "https://www.facebook.com");
			
		
request redirect using sendRedirect
			
				response.sendRedirect("https://www.oracle.com");*/
			
			}
			
			else{
				//writer.println("login failed");
				response.sendError(808,"oops! username & password is wrong");
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
