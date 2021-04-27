<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
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
<table border="1">
<tr>
	<th>Pet Id</th>
	<th>Pet Name</th>
	<th>Pet Age</th>
	<th>Pet Place</th>
	<th>Buy</th>
</tr>
<c:forEach items="${petList}" var="pet">
<tr>
	<td>${pet.id}</td>
	<td>${pet.name}</td>
	<td>${pet.age}</td>
	<td>${pet.place}</td>
	
	<td><a href="<c:url value='/fetchById/${pet.id}'/>">Buy</a>
</tr>	
</c:forEach>
</table>	
</div>
</body>
</html>