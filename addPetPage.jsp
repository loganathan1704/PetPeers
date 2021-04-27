<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Pet Page</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
  
  <a class="navbar-brand" href="#">Pet Shop</a>
  <ul class="navbar-nav">
    <li class="nav-item">
      <a class="nav-link" href="<c:url value='/'/>">Home</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="#">My Pet</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="<c:url value='/addPet'/>">Add Pet</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="<c:url value='/logOut'/>">Logout</a>
    </li>
  </ul>
</nav>
<div class="container-fluid">
<c:url var="addAction" value="/savePet"/>
<form:form action="${addAction}" method="post" modelAttribute="petForm">
<table>
	<tr>
		<th>Pet Information</th>
	</tr>
	<tr>
		<td>Name:</td>
		<td><form:input type="text" path="name"/><font color="red"><form:errors path="name"/></font></td>
	</tr>
	<tr>
		<td>Age:</td>
		<td><form:input type="text" path="age"/><font color="red"><form:errors path="age"/></font></td>
	</tr>
	<tr>
		<td>Place:</td>
		<td><form:input type="text" path="place"/><font color="red"><form:errors path="place"/></font></td>
	</tr>
	<tr>
		<td><input type="submit" value="Add Pet"/></td>
		<td><input type="reset" value="Cancel"/></td>
	</tr>
</table>
</form:form>
</div>
</body>
</html>