package ca.gbc.lab1a;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Validation")
public class Validation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Validation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public static boolean isNullOrEmpty(String str) {
        if(str != null && !str.trim().isEmpty()) {
            return false;}
        return true;
        }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String email = request.getParameter("email");
		String msgsub = request.getParameter("messagesubject");
		String message = request.getParameter("messagebody");
		Random ran = new Random();
		int nxt = ran.nextInt(); 
		if(!isNullOrEmpty(firstname)&&!isNullOrEmpty(lastname)&&!isNullOrEmpty(email)&&!isNullOrEmpty(message)
				&&!isNullOrEmpty(msgsub))				
				{
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.print("<h1 style=\"position: center;text-align:center;\">Thank you!</h1>\r\n" + "<img src=\"WebContent/check-mark-icon.jpg\" alt=\"Check\">"+
					"<h3 style=\"position: center;text-align:center;\">One of our representative will review your "
					+ "request and get back to you within 24 hours</h3>\r\n" + 
					"<h3 style=\"position: center;text-align:center;\"id=\"randomID\">Your confirmation # is"+nxt+" </h3>");
			request.getRequestDispatcher("confirmation.html").include(request, response);
		}else {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.print("<h1 style=\"position: center;text-align:center;\">Thank you!</h1>\r\n" + 
					"<h3 style=\"position: center;text-align:center;\">One of our representative will review your "
					+ "request and get back to you within 24 hours</h3>\r\n" + 
					"<h3 style=\"position: center;text-align:center;\"id=\"randomID\">Your confirmation # is"+nxt+" </h3>");
			request.getRequestDispatcher("error.html").include(request, response);
		
		}

	}

}
