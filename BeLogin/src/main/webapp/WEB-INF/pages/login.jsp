<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
	<form:form method="POST" commandName="utente"
		action="${pageContext.request.contextPath}/utente/login.html">
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
					<td><input type="submit" value="LOG" /></td>
					<td></td>
				</tr>
			</tbody>
		</table>
	</form:form>
	
	<p>
		<a href="${pageContext.request.contextPath}/index.html">Home page</a>
	</p>
</body>
</html>