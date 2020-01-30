<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
<link href="<c:url value="/resources/css/css.css" />" rel="stylesheet">
<script src="<c:url value="/resources/css/js/jquery-3.4.1.js" />"></script>
<link href="<c:url value="/resources/css/css/bootstrap.css" />" rel="stylesheet">

 <script src="<c:url value="/resources/css/js/bootstrap.js" />"></script>
  

</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

			<a href="login">Login</a>
<hr/>
<div class="container">
<table class="table table-striped">
<thead>
<th>Id </th><th>Libelle </th> <th> </th> <th></th>
</thead>
<tbody>
<c:forEach var="c" items="${cs }">
<tr>
<td>${c.id } </td><td>${c.libelle } </td><td> <a href='deletecat/${c.id}' class="btn btn-primary">delete</a> </td>
<td><a href="editcat/${c.id}">Edit</a> </td>
<td>  
<button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#myModal${c.id }">Open Details</button>
 </td>
</tr>
<!-- Modal -->
  <div class="modal fade" id="myModal${c.id }" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content ">
        <div class="alert-warning modal-header" >
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title"> Header</h4>
        </div>
        <div class="modal-body">
          <p>${c.libelle } </p>
        </div>
        <div class="alert-success modal-footer">
          <button type="button" class="btn btn-warning" data-dismiss="modal">Close</button>
        </div>
      </div>
      
    </div>
  </div>
</c:forEach>
</tbody>
</table>
</div>
</body>
</html>
