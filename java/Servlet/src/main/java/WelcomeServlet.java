import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
 import javax.servlet.annotation.WebServlet; 
 @WebServlet("/WelcomeServlet")
public class WelcomeServlet extends HttpServlet {  
public void doPost(HttpServletRequest request, HttpServletResponse response)  
    throws ServletException, IOException {  
  
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
          
    String n=request.getParameter("username");  
    out.print("Welcome To Our Event <a href='Home.jsp'>Home</a><a href='Login.jsp'>Logout</a>");  
          
    out.close();  
    }  
  
}