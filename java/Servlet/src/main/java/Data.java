import java.io.*;
import java.sql.*;
import java.sql.Connection;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.*;class Data extends HttpServlet
{
    String fname,lname,email,date,time,topic,location;
 public void doGet(HttpServletRequest request, HttpServletResponse response)
                  throws ServletException, IOException {

          
            try {
                    response.setContentType("text/html");
            PrintWriter out = response.getWriter();
                  Class.forName("com.mysql.jdbc.Driver");
                  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/event_form", "root", "");
                  Statement st=con.createStatement();
                ResultSet r=st.executeQuery("select * from eventform");
                while(r.next())
                {
                     fname=r.getString(1);
                     lname=r.getString(2);
                     email=r.getString(3);
                     date=r.getString(4);
                     time=r.getString(5);
                     topic=r.getString(6);
                     location=r.getString(7);
                }
                
                RequestDispatcher dispatcher = request.getRequestDispatcher("eventregister.jsp");
                request.setAttribute("fname","vengat"); 
                dispatcher.forward( request, response );
         }
         catch(Exception ex)
         {
             ex.printStackTrace();
         }
}
}