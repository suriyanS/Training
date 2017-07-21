
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!Doctype html>
<html>

<head>
	<title> Event Registration </title>

	<meta charset='utf-8'>
	<link rel='shortcut icon' href='fav.jpg' type='image' />
	<meta name='viewport' content='width=device-width, initial-scale=1'>
	<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css'>
	<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js'></script>
	<script src='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js'></script>

	<style>
		.well {
			background-color: #3d40db;
			text-align: center;
			font-size: 30px;
			color: white;
		}

		.jumbotron {
			color: #db443d;
			background-color: #e4e8dc;
		}

		label {
			display: inline-block;
			width: 140px;
			text-align: center;
		}
	</style>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

</head>

<body>
	<div class='container-fluid'>
		<br/>
		<div class='well'>Event Registration</div>
		<br/>

		<div class='jumbotron'>
			<form action='Event' class='form-inline' method='post'>
				<div class='row'>

					<div class='col-sm-4'>
						<label>First Name:</label> <input type='text' required placeholder='First Name'' name='firstname'/><br/><br/>  
    <label>Last Name:</label> <input type='text'  placeholder='Initial' ' name='lastname' /><br/><br/>
					</div>

					<div class='col-sm-4'>
						<label>Email Id:</label> <input type='email' placeholder='Email' required name='email' /><br/><br/>
						<label>Date:</label> <input type='date' required placeholder='Date' name='date' /><br/><br/>
					</div>

					<div class='col-sm-4'>
						<label>Time:</label> <input type='time' placeholder='Time' required name='time' /><br/><br/>
						<label>Topic:</label> <input type='text' placeholder='Topic' required name='topic' /><br/><br/>
					</div>

					<label>Location: </label>
					<select name='location'>  
    <option>Coimbatore</option>  
    <option>Bangalore</option>  
    <option>other</option>  
    </select>
					<br/><br/>

					<div class='span12'>
						<button  class='btn btn-primary' type='submit'>Register <span class='glyphicon glyphicon-save'></span></button>

						<button  class='btn btn-danger' type='reset'>Cancel <span class='glyphicon glyphicon-remove'></span></button>

					</div>
				</div>
			</form>
		</div>



		<div>
			<table class='table table-bordered '>
			
				<thead>
					<tr>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Email id</th>
						<th>Date</th>
						<th>Time</th>
						<th>Topic</th>
						<th>Location</th>
						<th>Action</th>
					</tr>
				</thead>
				
				<tbody>
				<c:forEach items="${data}" var="val">
					<tr class='danger'>
							
						<td><c:out value = "${val}"/></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>

						<td>
							<button class='btn btn-primary'>Edit <span class='glyphicon glyphicon-pencil'></span></button>
							<button class='btn btn-danger'>Delete <span class='	glyphicon glyphicon-trash'></span></button>
						</td>
					</tr>
				</c:forEach>
				</tbody>
				
			</table>
		</div>

	</div>

</body>

</html>