<html>
<head>
<title>New User Login</title>
<meta charset='utf-8'>
	<link rel='shortcut icon' href='fav.jpg' type='image' />
	<meta name='viewport' content='width=device-width, initial-scale=1'>
	<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css'>
	<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js'></script>
	<script src='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js'></script>

<style>
.signup{
  margin-left:400px;
  margin-top:135px;
  padding:25px;
  width:500px;
  border: 10px solid skyblue;
}
	label {
			display: inline-block;
			width: 500px;
			text-align: center;
		}
  .bts{
    margin-left:190px;
  }
  .btc{
    margin-left:15px;
  }
</style>
</head>


<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#"><img src="fav.jpg" width="50" height="50"></a>
    </div>
    
      <a href="Home.jsp"> <button class="btn btn-success">Home</button></a></li>
     

   <a href="Login_Ex.jsp" <button class="btn btn-info navbar-btn">Sign In</button></a>
  </div>
</nav>

<div class="signup">
<form method="POST" action="Login_NewStore" onsubmit="return checkForm(this);">


<label>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; Username: <input title="Enter your username" required type="text" required pattern="\w+" name="username" placeholder="Create Username"></label>
<br/>
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;<label>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; Password: <input title="Password must contain at least 6 characters, including UPPER/lowercase and numbers" placeholder="Create Password"type="password" required pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,}" name="pwd1" onchange="
  this.setCustomValidity(this.validity.patternMismatch ? this.title : '');
  if(this.checkValidity()) form.pwd2.pattern = this.value;
"></label>
<br/>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
<label>Confirm Password: <input title="Please enter the same Password as above" placeholder="Confirm Password"type="password" required pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,}" name="pwd2" onchange="
  this.setCustomValidity(this.validity.patternMismatch ? this.title : '');
"></label> </br>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;<br/>
<button type="submit" class="btn btn-success btn-md bts">Sign Up</button>

<button type="reset" class="btn btn-danger btn-md btc">Cancel</button>

</form>
</div>

</body>
</html>