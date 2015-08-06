<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page contentType="text/html; charset=UTF-8"%>

<html>
<head>
<title>SN Systems Login</title>

	<link rel="stylesheet" type="text/css" href="static/css/global.css"/>
	<script type="text/javascript" src="<c:url value="/static/js/common.js" />"></script>


</head>
<body>
	<form:form method="POST" modelAttribute="userForm" action="login/authenticate">

	<h2>${message}</h2>

		<table class="alignCenter">
			<tr style="height: 100px">
			<tr>
				<td><form:label path="username">Username</form:label></td>
				<td><form:input path="username" /></td>
			</tr>
			<tr>
				<td><form:label path="password">Password</form:label></td>
				<td><form:input path="password" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit" /></td>
				<td><input type="reset" value="Reset" onclick="testAlert();"/></td>
			</tr>
		</table>

	</form:form>

</body>
</html>