   <html>
   <head>
<title>Login</title>
<meta charset='utf-8'>
	<link rel='shortcut icon' href='fav.jpg' type='image' />
	<meta name='viewport' content='width=device-width, initial-scale=1'>
	<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css'>
	<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js'></script>
	<script src='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js'></script>

<style>
.login{
    
    border: 10px solid skyblue;
    margin-top:150px;
    margin-left:400px;
    padding:50px;
    width:600px;
    background-color:white;
}
.bt{
    width:150px;
}
body {
    background-image: url("http://www.whizjuniors.com/Content/img/banner.jpg");
}
select{
    width:150px;
}
</style>

   </head>

<body>
<div class="login" align="center">

    <form action="LoginValidation" method="post">  
    <label for="username">User Name:</label>
   <input type="text" name="username" id="username"/><br/><br/> 
   <label for="username">Password:</label> 
    <input type="password" name="userpass"/><br/><br/>  

   <label name="user">User: </label>
					<select name='user'>  
     
    <option>Existing User</option>  
    <option>Admin</option>  
    </select>  
    <br/><br/>
      <button type="submit" class="btn btn-primary bt">Sign in</button> 
    
    </form>  

    </div>
    </body>
    </html>