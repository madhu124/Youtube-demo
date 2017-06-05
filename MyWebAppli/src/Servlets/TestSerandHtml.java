package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestSerandHtml extends HttpServlet {
public void doGet(HttpServletRequest request,HttpServletResponse response){
System.out.println("Welcome to global solutions");

PrintWriter pw;
String userId=request.getParameter("userid");
String password=request.getParameter("pwd");
try {
	
	// config parameter
	ServletConfig config=getServletConfig();
	String sub=config.getInitParameter("Email");
	
	//context parameter
	ServletContext context=getServletContext();
	String url=context.getInitParameter("dbUrl");
	
	 pw=response.getWriter();
	pw.println("Hello");
	pw.println(userId);
	pw.println(password);
	pw.println(sub);
	pw.println(url);
	
	
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


}
}