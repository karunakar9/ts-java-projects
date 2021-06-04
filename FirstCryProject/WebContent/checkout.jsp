<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<title>First Cry</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
table, th, td {
	border: 2px solid black;
}
</style>

</head>
<body style="background-color: white;">
	<nav class="navbar" style="background-color: green">

		<div class="container">
			<div class="navbar-header">
				<a><image src="Images/fc.png" style="width:60%"></image></a>

			</div>

			<ul class="nav navbar-nav navbar-right">
				<br>

				<button type="button" class="btn btn-primary">Welcome
					${userName}</button>
				&nbsp;&nbsp;&nbsp;
				<a href="logout.jsp" class="btn btn-primary">LogOut</a>

			</ul>
			<br> <br>
		</div>
	</nav>


NAME OF CUSTOMER:${userName}


	<br>
	<br>
	<h1 style="text-align: center;">Items in Cart Are (Checkout Page):</h1>
	<br>
	<br>


	<center>

		<table class="table table-hover" style="width: 70%">
			<tr>
				<th>Item Id</th>
				<th>Image</th>
				<th>Name</th>
				<th>UnitPrice</th>
				<th>Quantity</th>
			</tr>
			<c:forEach var="obj" items="${selectedItems}" varStatus="st">
				<tr>
					<td>${obj.id}</td>
					<input type="hidden" name="itemId" value="${obj.id}">
					<td><img src="Images/${obj.imageUrl}" style="width:150px;max-height:150px"></td>
					<td>${obj.name}</td>
					<td>${obj.price}</td>
					<td>${qList.get(st.index)}</td>
				</tr>
			</c:forEach>
		</table>
		<br> <br> Total Order = Rs : ${tp} <br> <br>
		  <br> <br>
		<form action="FirstCryServlet"  method="post">
			<input type="submit" class="btn btn-primary" name="button"
				value="Continue" />
		</form>
	</center>
</body>
</html>