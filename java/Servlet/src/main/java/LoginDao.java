import java.sql.*;  
  
public class LoginDao {  
 public static Connection getConnection(){  
            Connection con=null;  
            try{  
                Class.forName("com.mysql.jdbc.Driver");  
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/event_form", "root", "");  
            }catch(Exception e){System.out.println(e);}  
            return con;  
        }  
 
public static boolean validateAdmin(String username,String userpass,String user){  
boolean status=false;  
try{  
     
  Connection con=LoginDao.getConnection();     
PreparedStatement ps=con.prepareStatement(  
"select * from admin_login where username=? and userpass=? and user=?");  
ps.setString(1,username);  
ps.setString(2,userpass);  
ps.setString(3,user);
      
ResultSet rs=ps.executeQuery();  
status=rs.next();  
          
}catch(Exception e){System.out.println(e);}  
return status;  
}  
}