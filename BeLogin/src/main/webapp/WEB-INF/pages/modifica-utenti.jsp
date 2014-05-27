<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<?xml version="1.0" encoding="ISO-8859-1" ?>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<script type="text/javascript"
	src="<br>
http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Modifica utente</title>
</head>
<body>
	<h1>modifica utente</h1>
	<p>modifica utente</p>
	<p>${message}</p>

	<form:form method="POST" commandName="team"
		action="${pageContext.request.contextPath}/utente/edit/${team.id}.html">
		<table>
			<tbody>
				<tr>
					<td>Nome:</td>
					<td><form:input path="name" /></td>
				</tr>
				<tr>
					<td>numero:</td>
					<td><form:input path="rating" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="Edit" /></td>
					<td></td>
				</tr>
			</tbody>
		</table>
	</form:form>

	<p>
		<a href="${pageContext.request.contextPath}/index.html">Home</a>
	</p>
</body>
</html>