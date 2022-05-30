<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- when working with jsp we need to write jasper dependency in pom file -->
<!-- go to mvn repository for adding tomcat jasper dependency in pom file -->
	<form action = "addEmployee">
	<input type ="text" name = "id"><br>
	<input type = "text" name = "name"><br>
	<input type ="submit">
	</form>
</body>
</html>