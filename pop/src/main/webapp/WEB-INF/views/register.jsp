<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
<style>
    .error 
    {
        color: #ff0000;
        font-weight: bold;
    }
    </style>
</head>
<body>
	<form:form id="regForm" modelAttribute="user"  action="registerProcess"
		method="post">

		<table align="center">
			<tr>
				<td><form:label path="login">Username</form:label></td>
				<td><form:input path="login" name="username" id="username" /></td>
				<td><form:errors path="login" cssClass="error" />
				</td>
			</tr>
			<tr>
				<td><form:label path="password">Password</form:label></td>
				<td><form:password path="password" name="password"
						id="password" /></td>
			</tr>
			<tr>
				<td><form:label path="profile.nom">FirstName</form:label></td>
				<td><form:input path="profile.nom" name="firstname"
						id="firstname" /></td>
			</tr>
			<tr>
				<td><form:label path="profile.prenom">LastName</form:label></td>
				<td><form:input path="profile.prenom" name="lastname" id="lastname" /></td>
			</tr>
			<tr>
				<td><form:label path="profile.email">Email</form:label></td>
				<td><form:input path="profile.email" name="email" id="email" /></td>
			</tr>
			

			<tr>
				<td></td>
				<td><form:button id="register" name="register">Register</form:button></td>
			</tr>
			<tr></tr>
			<tr>
				<td></td>
				<td><a href="/gr">Home</a></td>
			</tr>
		</table>
	</form:form>

</body>
</html>