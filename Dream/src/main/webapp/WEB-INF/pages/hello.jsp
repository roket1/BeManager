<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Esempio Spring MVC: FORM</title>
</head>
<body>
	<h2>messaggio: ${message}</h2>
	<form:form action="welcome" commandName="utente">
		<table>
			<tr>
				<td colspan="2" align="center"><h2>Effettua il login</h2></td>
			</tr>
			<tr>
				<td>User Name:</td>
				<td><form:input path="username" /></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><form:password path="password" /></td>
			</tr>
			<tr>

				<td><input type="submit" value="Register" /></td>
			</tr>
		</table>


	</form:form>
</body>
</html>