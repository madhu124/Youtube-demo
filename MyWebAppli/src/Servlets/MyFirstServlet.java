package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.UserService;

public class MyFirstServlet extends HttpServlet {
 /*public void service(HttpServletRequest request,HttpServletResponse response){
	System.out.println("hello from my first servlet class"); 
	
 }*/
	
	/*public void doPost(HttpServletRequest request,HttpServletResponse response){
		System.out.println("hello from my first servlet class"); 
		
		
		PrintWriter pw;
		try {
			
			String name=request.getParameter("Username");
			
			String id=request.getParameter("id");
			String host=request.getHeader("host");
			Enumeration<String> en=request.getParameterNames();
              ServletConfig config=getServletConfig();
              Map<String,String[]> hashMap=request.getParameterMap();
             			String sub=config.getInitParameter("EmailId");
			
			ServletContext context=getServletContext();
			String url=context.getInitParameter("dbUrl");
			String userId=request.getParameter("userid");
			String password=request.getParameter("pwd");

			
			pw = response.getWriter();
			 pw.println("--------");

			/* pw.println("<h1> welcome to my class");
			 pw.println("<hr/>");
			 pw.println("<br/>");
			 pw.println(userId);
			 pw.print("<br/>");
			 pw.println(password);
			 pw.println("<hr/>");
			 pw.println("<br/>");
			 
			 
			 pw.println(name);
			 pw.println(id);
			 pw.print(host);
			 pw.print(sub);
			 pw.println("------------");
			 pw.println(url);
			 while(en.hasMoreElements()){
				 String pName=en.nextElement();
				 pw.println(pName);
				 pw.print(" is ");
				 pw.println(request.getParameter(pName));
				 
			 }
			 
			 pw.println("</h1>");
pw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
	public void doPost(HttpServletRequest request1,HttpServletResponse response1){
		
		String userId=request1.getParameter("userid");
		String password=request1.getParameter("pwd");
		try{
			UserService service=new UserService();
			boolean isValidLogin=service.validatePassword(userId, password);
		
			if(isValidLogin){
			
			PrintWriter pw = response1.getWriter();
		 pw.println("<h1> welcome to my hello class");
		/* pw.println("<hr/>");
		 pw.println("<br/>");
		 pw.println(userId);
		 pw.print("<br/>");
		 pw.println(password);
		 pw.println("<hr/>");
		 pw.println("<br/>");*/
}
			else{
				response1.sendRedirect("hello.html");
			}
		}
		catch(IOException e){
			e.printStackTrace();
	
		 

	}
	
}
}