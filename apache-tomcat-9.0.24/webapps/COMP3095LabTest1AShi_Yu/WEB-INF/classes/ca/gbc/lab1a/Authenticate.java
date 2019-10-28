package ca.gbc.lab1a;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Authenticate
 */
@WebServlet("/Authenticate")
public class Authenticate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Authenticate() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String pswd = request.getParameter("password");
		if(username.equals("gbc")&&pswd.equals("p@ssword")) {
			request.getRequestDispatcher("contact.html").forward(request, response);
		}else {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.print("<h2></h2>");
			request.getRequestDispatcher("loginError.html").include(request, response);
			
		}
	}

}
