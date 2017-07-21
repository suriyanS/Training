public class Login
{ 
    String id;
    String username,password;
  
 /*       this.id=id;
        this.username=username;
        this.password=password;*/
    
    public void setId(String id)
    {
       this.id=id;
    }
     public void setUsername(String username)
    {
       this.username=username;
    }
    public void setPassword(String password)
    {
        this.password=password;
    }
    public String getId()
    {
        return this.id;
    }
    public String getUsername()
    {
        return this.username;
    }
    public String getPassword()
    {
        return this.password;
    }
}