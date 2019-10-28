package first.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet("/HelloWorld")
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloWorld() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.println("");
		pw.println("");
		pw.println("");
		pw.println("<h1>Hello World</h1>");
		LocalDate myObj = LocalDate.now(); // Create a date object
		pw.println(myObj);
		Random b=new Random();
		int a=b.nextInt(100);
		pw.println("You new number is:"+a);
		if (a%2==0) 
		{
			pw.println("and it is even.");
		}
		else {pw.println("and it is odd");}
		pw.println("");
		
		int i,m=0,flag=0;      
		m=a/2;      
		if(a==0||a==1){  
			pw.println(a+" is not prime number");      
		  }else{  
		   for(i=2;i<=m;i++){      
		    if(a%i==0){      
		    	pw.println(a+" is not prime number");      
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0)  { pw.println(a+" is prime number"); }  
		  }
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
