import java.io.IOException;
import java.io.PrintWriter;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

import javax.servlet.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import java.sql.Connection;
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet 
{
    
   
  public void doPost(HttpServletRequest request,HttpServletResponse res)throws IOException
  {
      try{
   PrintWriter out=res.getWriter();
   String id=request.getParameter("id");
   String user=request.getParameter("username");
   String pass=request.getParameter("password");
   Connection conn=DBConnection.getDBConnection();
   Statement st=conn.createStatement();
   PreparedStatement pr=conn.prepareStatement("insert into loginuser values(?,?,?)");
   pr.setString(1,id);
   pr.setString(2,user);
   pr.setString(3,pass);
   pr.executeUpdate();
   ResultSet rs=st.executeQuery("select * from loginuser");
   out.println("<html><body><form action='UpdateServlet' method='post'><table border=5><tr><th>username</th><th>password</th></tr>");
   while(rs.next())
   {
       out.println("<tr><td>"+rs.getString(1)+"<td>"+rs.getString(2)+"<td>"+"<input type='submit' name='edit' value='edit'>");
   }
   out.println("</tr></table></form></body></html>");
  // res.sendRedirect("viewlogin.jsp");
      }catch(Exception e){}
  }
}