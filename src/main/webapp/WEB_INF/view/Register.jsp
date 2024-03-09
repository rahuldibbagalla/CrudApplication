<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
</head>
<body>
	<h1>Register a new Student</h1>
	<div>
		<form action="@{/Register}">
			<label id="name">Name</label> 
			<input type="text"	placeholder="Enter Name"> 
			<label id="age">Age</label> 
			<input type="text" placeholder="Enter Age"> 
			<label id="gender">Gender</label>
			<input type="radio" name="gender" value="male"> Male 
			<input type="radio" name="gender" value="female"> Female
			
			<input type="submit" value="submit">Register

		</form>
	</div>
</body>
</html>