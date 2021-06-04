<%@page import="com.dao.StudentDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.model.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<center><h4>Getting All Details:</h4></center>
	<div class="container">
		<table class="table table-dark table-hover">
			<thead>
				<tr>

					<th>Name</th>
					<th>Batch</th>
					<th>Action</th>

				</tr>
			</thead>
			<tbody>

				<c:forEach var="obj" items="${StudentList}">
					<%-- <hidden <c:out value="${obj.getId()}" /> name=idsArray/> --%>
					<tr>
						<td><c:out value="${obj.getName()}" /></td>
						<td><c:out value="${obj.getBatch()}" /></td>
						<form action="StudentServlet" method="post">
							<td><input type="hidden" name="PresentId"
								value="<c:out value="${obj.getId()}"/>"> <input
								type="submit" name="bt" value="Action" /></td>
						</form>
						<br>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>