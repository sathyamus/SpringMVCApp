<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<html>
<head>
<title>SN Systems Login</title>
</head>
<body>
	<form:form method="POST" modelAttribute="userForm" action="login/authenticate">
		<table>
			<tr>
				<td><form:label path="username">Username</form:label></td>
				<td><form:input path="username" /></td>
			</tr>
			<tr>
				<td><form:label path="password">Password</form:label></td>
				<td><form:input path="password" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>
		</table>

	</form:form>
	<h2>${message}</h2>

</body>
</html>