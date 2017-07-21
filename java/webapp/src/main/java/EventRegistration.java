import java.io.IOException;
import java.io.PrintWriter;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;

@WebServlet("/EventRegistration")
public class EventRegistration extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        String fname = request.getParameter("firstname");
        String lname = request.getParameter("lastname");
        String email1 = request.getParameter("email");
        String date1 = request.getParameter("date");
        String time1 = request.getParameter("time");
        String topic1 = request.getParameter("topic");
        String location1 = request.getParameter("location");
        try {
            // DBConnection dbc=new DBConnection();
            Connection conn = DBConnection.getDBConnection();
            Statement st = conn.createStatement();
            String sql = "insert into event(firstname,lastname,email,date,time,topic,location)values(?,?,?,?,?,?,?)";
            PreparedStatement pr = conn.prepareStatement(sql);
            pr.setString(1, fname);
            pr.setString(2, lname);
            pr.setString(3, email1);
            pr.setString(4, date1);
            pr.setString(5, time1);
            pr.setString(6, topic1);
            pr.setString(7, location1);
            int result = pr.executeUpdate();
            ResultSet rs = st.executeQuery("Select * from event");

            pw.println("<table border=1 style='background-color:White'>");
            while (rs.next()) {
                pw.println("<tr><td>" + rs.getString(1) + "<td>" + rs.getString(2) + "<td>" + rs.getString(3) + "<td>"
                        + rs.getString(4) + "<td>" + rs.getString(5) + "<td>" + rs.getString(6) + "<td>"
                        + rs.getString(7) + "</tr>");
            }
            pw.println("</table>");
            pw.close();
        }

        catch (Exception e) {
            e.printStackTrace();
        }

    }
}