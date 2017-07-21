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
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet 
{
    
   
  public void doPost(HttpServletRequest request,HttpServletResponse res)throws IOException
  {
      try{
   PrintWriter out=res.getWriter();
   String user1=request.getParameter("user123");
   String pass1=request.getParameter("password");
   Connection conn=DBConnection.getDBConnection();
  // PreparedStatement pr=conn.prepareStatement("update login set username="+user1+"and password="+pass1+"where 1");
  // pr.executeUpdate();
   out.println("<h1>"+user1+" "+pass1+"</h1>");
      }catch(Exception e){}
    }
}