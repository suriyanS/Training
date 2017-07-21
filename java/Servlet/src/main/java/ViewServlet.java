import java.io.IOException;  
import java.io.PrintWriter;  
import java.util.List;  
  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
@WebServlet("/ViewServlet")  
public class ViewServlet extends HttpServlet {  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)   
               throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        out.println();
       // out.println("<a href='index.jsp'>Add New Login User</a>");  
        out.println("<h1>LoginUsers List</h1>");  
          
        List<Login> list=LoginDao.getAllLoginUsers();  
          
        out.print("<table border='1' width='100%'");  
        out.print("<tr><th>Id</th><th>Username</th><th>Password</th><th>Edit</th><th>Delete</th></tr>");  
        for(Login l:list){  
         out.print("<tr><td>"+l.getId()+"</td><td>"+l.getUsername()+"</td><td>"+l.getPassword()+"</td>"  
                +"</td><td><a href='EditServlet?id="+l.getId()+"'>edit</a></td><td><a href='DeleteServlet?id="+l.getId()+"'>delete</a></td></tr>");  
        }  
        out.print("</table>");  
          
        out.close();  
    }  
}  