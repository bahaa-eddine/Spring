<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="Spring" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<title>Person Index</title>
</head>
<body>
<div class="container">
<table class="table">
	<thead>
		<th>Nom</th>
		<th>Prenom</th>
		<th>Ville</th>
		<th>Age</th>
		<th></th>
		<th>
		<form action="save.htm">
			<button class="btn">Ajouter</button>
		</form>
		</th>
	</thead>
	<tbody>
	<Spring:forEach items="${PersonList}" var="list">
		<tr>
			<td>${list.lastName}</td>
			<td>${list.firstName}</td>
			<td>${list.city}</td>
			<td>${list.age}</td>
			<td>
			<form action="update.htm">
				<button class="btn btn-primary" value="${list.id}" name="id">Changer</button>
			</form>
			</td>
			<td>
			<form action="delete.htm">
				<input type="text" name="id" value="${list.id}" hidden>
				<button class="btn btn-danger">Supprimer</button>
			</form>
			</td>
		</tr>
	</Spring:forEach>
	</tbody>
</table>
</div>
</body>
</html>