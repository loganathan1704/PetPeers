<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
</head>
<body>
<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
  <a class="navbar-brand" href="<c:url value='/'/>">Pet Shop</a>
  <ul class="navbar-nav">
    <li class="nav-item">
      <a class="nav-link" href="<c:url value='/user'/>">Login</a>
    </li>
  </ul>
</nav>
<div class="container-fluid">
<h2>Register</h2>
<c:url var="useAction" value="/saveUser"/>
<form:form action="${useAction}" method="post" modelAttribute="userForm">
<table>
	<tr>
		<td>Name:</td>
		<td><form:input type="text" path="userName"/><font color="red"><form:errors path="userName"/></font></td>
	</tr>
	<tr>
		<td>Password:</td>
		<td><form:password path="userPassword"/><font color="red"><form:errors path="userPassword"/></font></td>
	</tr>
	<tr>
		<td>Confirm Password:</td>
		<td><form:password path="confirmPassword"/><font color="red"><form:errors path="confirmPassword"/></font></td>
	</tr>
	<tr>
		<td><input type="submit" value="Register"/></td>
	</tr>
</table>
</form:form>
</div>
</body>
</html>