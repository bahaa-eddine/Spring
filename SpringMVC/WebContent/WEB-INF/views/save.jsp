<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
<form action="insert.htm" >
	<table class="table">
		<tr>
			<th>Nom :</th>
			<td><input required type="text" name="lastName"></td>
		</tr>
			<tr>
			<th>Prenom :</th>
			<td><input required type="text" name="firstName"></td>
		</tr>
			<tr>
			<th>Ville :</th>
			<td><input required type="text" name="city"></td>
		</tr>
		<tr>
			<th>Age :</th>
			<td><input required type="text" name="age"></td>
		</tr>
		<tr><th><button class="btn">Ajouter</button></th></tr>
	</table>
</form>
</body>
</html>