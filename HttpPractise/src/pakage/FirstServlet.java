package pakage;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FirstServlet
 */
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
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
      //get the request details
		
		String name=request.getParameter("name");
		String pwd=request.getParameter("pwd");
		if(pwd.equals("9271")){
			
			//get http session
			HttpSession session=request.getSession();
			session.setAttribute("name",name);
			session.setAttribute("pwd", pwd);
			
			//Add Redirect
			RequestDispatcher dispatcher=request.getRequestDispatcher("design2.html");
			dispatcher.forward(request, response);
			
			
		}
		else{
			response.sendError(808,"OOps! the Password u entered is wrong please try again");
		}
	
	
	
	
	}

}

