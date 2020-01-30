<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <link href="<c:url value="/resources/css/css/bootstrap.css" />" rel="stylesheet">

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<c:forEach var="c" items="${cs }">
<tr>
<td>${c.id }  </td>
<td>${c.libelle }  </td>
<td> <a href='delete/${c.id }' class="btn btn-info">delete</a> </td>
</tr>
 </c:forEach>
</table>
</body>
</html>