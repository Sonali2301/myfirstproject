<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
</head>
<body>

<form:form action="processForm" method="post" modelAttribute="student">
First Name:<form:input path="firstName"/></br>
Last Name:<form:input path="lastName"/>
<input type="submit" value="submit">
</form:form>

</body>
</html>