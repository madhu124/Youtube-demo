

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	PrintWriter pw= response.getWriter();
	response.setContentType("text/html");
	String uname= request.getParameter("uname");
	String pwd= request.getParameter("pwd");
if(uname.equals(pwd)){
	pw.println("welcome to our page");
}
else{
	pw.println("please check again and login");
	RequestDispatcher rd= request.getRequestDispatcher("./Login.html");
	rd.forward(request, response);


}
	
	
	
	
	}

}
