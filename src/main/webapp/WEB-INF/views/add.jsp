<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add new equipment</title>
</head>
<body>
	<h1>Add</h1>
	<form:form commandName="equipment" action="save.htm" method="POST">
		<form:input path="name" /><br/>
		<form:input path="count" /><br/>
		<form:button>Save</form:button>
	</form:form>
</body>
</html>