<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pagina personale di ${username}</title>
</head>
<body>
	<h1>Benvenuto ${username}</h1>

	<p>
		<a href="${pageContext.request.contextPath}/index.html">Home page</a>
	</p>
</body>
</html>