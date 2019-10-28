package ca.gbc.library.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdminAuthenticateSerlet
 */
@WebServlet("/AdminAuthenticate")
public class AdminAuthenticateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public AdminAuthenticateServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("adminEmail");
		String pswd = request.getParameter("adminPassword");
		
		/*if(username != null && username.length()>0) {
			if(username.equals("shy1860@hotmail.com")) {
				request.getRequestDispatcher("adminhome.html").forward(request, response);
			}
			
			
			
		}
		else 
		{
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.print("<h2>Invalid Credentials Provided!</h2>");
			request.getRequestDispatcher("index.html").include(request, response);
		}*/
		if(AuthADM.checkAdm(username,pswd)) 
		{
			request.getRequestDispatcher("adminhome.html").forward(request, response);
		}
		else 
		{
			request.getRequestDispatcher("index.html").forward(request, response);
			/*response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.print("<h2>Invalid Credentials Provided!</h2>"+username+pswd);
			request.getRequestDispatcher("index.html").include(request, response);*/
		}
	}

}


