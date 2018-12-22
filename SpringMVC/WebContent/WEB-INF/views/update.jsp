<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="Spring" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="updateP.htm" >
	<table class="table">
		<tr >
			<td><input hidden type="text" name="id" value="${id}"></td>
		</tr>
		<tr>
			<th>Nom :</th>
			<td><input required type="text" name="lastName" value="${lastname}"></td>
		</tr>
			<tr>
			<th>Prenom :</th>
			<td><input required type="text" name="firstName" value="${firstname}"></td>
		</tr>
			<tr>
			<th>Ville :</th>
			<td><input required type="text" name="city" value="${city}"></td>
		</tr>
		<tr>
			<th>Age :</th>
			<td><input required type="text" name="age" value="${age}"></td>
		</tr>
		<tr><th><button class="btn">Modifier</button></th></tr>
	</table>
</form>
</body>
</html>