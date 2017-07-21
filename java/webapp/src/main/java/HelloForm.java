import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HelloForm")
public class HelloForm extends HttpServlet{
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException
    {
        response.setContentType("text/html");

        PrintWriter out=response.getWriter();
        String title = "Hello Form";
        String num1=request.getParameter("number1");
        String num2=request.getParameter("number2");
        int a=Integer.parseInt(num1);
        int b=Integer.parseInt(num2);
        int result=a+b;
        out.println("<html>\n"+title+"<body  bgcolor = \"#f0f0f0\"><ul>"+result+"</ul></body></html>");

    }
}