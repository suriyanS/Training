import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
@WebServlet("/EditServlet")  
public class EditServlet extends HttpServlet {  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)   
           throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        out.println("<h1>Update Login user</h1>");  
        String id=request.getParameter("id");  
        //int id=Integer.parseInt(sid);  
          
        Login l=LoginDao.getLoginUserById(id);  
          response.sendRedirect("index.jsp");
       /* out.print("<form action='index.jsp' method='post'>");  
        out.print("<table>");  
        out.print("<tr><td></td><td><input type='hidden' name='id' value='"+l.getId()+"'/></td></tr>");  
        out.print("<tr><td>Name:</td><td><input type='text' name='name' value='"+l.getUsername()+"'/></td></tr>");  
        out.print("<tr><td>Password:</td><td><input type='password' name='password' value='"+l.getPassword()+"'/></td></tr>");  
        
        out.print("<tr><td colspan='2'><input type='submit' value='Edit & Save '/></td></tr>");  
        out.print("</table>");  
        out.print("</form>");  */
          
        out.close();  
    }  
}  