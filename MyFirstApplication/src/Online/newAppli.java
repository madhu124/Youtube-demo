package Online;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class newAppli extends HttpServlet{

	
public void doGet(HttpServletRequest request, HttpServletResponse response){
		PrintWriter pw;
		String uname=request.getParameter("uname");
		String upass=request.getParameter("upass");
		
		try {
			response.setContentType("text/html");
			 pw=response.getWriter();
			pw.println("welcome to server");
			
			
			
			pw.println(uname);
			pw.println(upass);
			/*if(uname.equals("vakula") && upassword.equals("varam")){
				pw.println("login succesfull");
			}
			else{
				pw.println("login falied");
			}
			*/
			
			
		} catch (IOException e) {
						e.printStackTrace();
		}
		
		
	}
}
