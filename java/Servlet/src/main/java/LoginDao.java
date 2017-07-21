import java.util.*;  
import java.sql.*;  
  
public class LoginDao {  
  
    public static Connection getConnection(){  
        Connection con=null;  
        try{  
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","");
        }catch(Exception e){System.out.println(e);}  
        return con;  
    }  
    public static int save(Login l){  
        int status=0;  
        try{  
            Connection con=LoginDao.getConnection();  
            PreparedStatement ps=con.prepareStatement(  
                         "insert into loginuser(id,user_name,pass_word) values (?,?,?)");  
            ps.setString(1,l.getId());             
            ps.setString(2,l.getUsername());  
            ps.setString(3,l.getPassword()); 
           
              
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
    public static int update(Login l){  
        int status=0;  
        try{  
            Connection con=LoginDao.getConnection();  
            PreparedStatement ps=con.prepareStatement(  
                         "update loginuser set id=?,user_name=?,pass_word=?where id=?");  
            ps.setString(1,l.getId());             
            ps.setString(2,l.getUsername());  
            ps.setString(3,l.getPassword());  
            ps.setString(4,l.getId()); 
              
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
    public static int delete(String id){  
        int status=0;  
        try{  
            Connection con=LoginDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("delete from loginuser where id=?");  
            ps.setString(1,id);  
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return status;  
    }  
    public static Login getLoginUserById(String id){  
        Login l=new Login();  
          
        try{  
            Connection con=LoginDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from loginuser where id=?");  
            ps.setString(1,id);  
            ResultSet rs=ps.executeQuery();  
            if(rs.next()){  
                l.setId(rs.getString(1));  
                l.setUsername(rs.getString(2));  
                l.setPassword(rs.getString(3));  
  
            }  
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return l;  
    }  
    public static List<Login> getAllLoginUsers(){  
        List<Login> list=new ArrayList<Login>();  
          
        try{  
            Connection con=LoginDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from loginuser");  
            ResultSet rs=ps.executeQuery();  
            while(rs.next()){  
                Login l=new Login();  
                l.setId(rs.getString(1));  
                l.setUsername(rs.getString(2));  
                l.setPassword(rs.getString(3));  
 
                list.add(l);  
            }  
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return list;  
    }  
}  