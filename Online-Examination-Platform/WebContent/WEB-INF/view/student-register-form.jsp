<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Form</title>
</head>
<body>
	
	<h1> Student Register Form</h1>
	
	<form action="/studentRegister" method="post">
		<input type="text" placeholder="Registration ID" name="id" />
		<br/>
		<input type="text" placeholder="Name" name="name" /><br/>
		<br/>
		<input type="text" placeholder="Course" name="course" /><br/>
		<br/>
		<input type="text" placeholder="Department" name="department" /><br/>
		<br/>
		<input type="text" placeholder="E-mail" name="email" /><br/>
		<br/>
		<input type="password" placeholder="Password" name="password" /><br/>
		<br/>
		<input type="password" placeholder="Retype Password" name="repassword" /><br/>
		<br/>
		<input type="button" value="Submit" />
	
	</form>
	
</body>
</html>