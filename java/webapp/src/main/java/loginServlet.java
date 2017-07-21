import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet
{
 protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws  IOException {
PrintWriter out=response.getWriter();

String username=request.getParameter("username");
String password=request.getParameter("password");
if(username.equals("ajith")&&password.equals("ajith"))
{

     String htmlRespone = "<html>";
        htmlRespone += "<h2>Your username is: " + username + "<br/>";      
        htmlRespone += "Your password is: " + password + "</h2>";    
        htmlRespone += "</html>";
        // return response
        out.println(htmlRespone);
            }
            else
            {
                out.println("<h1>login failure</h1>");
            }

}
}