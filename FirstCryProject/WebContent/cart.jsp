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
	<nav class="navbar bg-success">
	<div class="container">
		<img src="Images/fc.png" style="height: 60px; width: 60px;"
			class="rounded-circle">
		<ul class="nav">
			<li><button type="button" class="btn btn-primary"
					data-toggle="modal" data-target="#Profile">Welcome ${userName}</button></li>&nbsp;&nbsp;&nbsp;&nbsp;
			<li><button type="button" class="btn btn-primary"
					data-toggle="modal" data-target="#Logout">Logout</button></li>&nbsp;&nbsp;&nbsp;&nbsp;
		</ul>

	</div>
	</nav>
	<div class="modal" id="Logout">
		<div class="modal-dialog">
			<div class="modal-content">



				<!-- Modal body -->
				<div class="modal-body">Are you sure to logout?</div>

				<!-- Modal footer -->
				<div class="modal-footer">
					<form action="logout.jsp" >
						<input type="submit" name="action" value="NO"data-dismiss="modal"
							class="btn btn-primary"/>&nbsp;&nbsp; <input type="submit"
							name="action" value="YES" class="btn btn-primary">&nbsp;&nbsp;
					</form>
				</div>

			</div>
		</div>
	</div>




	<br>
	<br>
	<h1 style="text-align: center;">Items in Cart Are :</h1>
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
		<form action="checkout.jsp">
		<input
			type="submit" class="btn btn-primary" name="action"
			value="Place Order" /> 
			</form><br> <br>
		<form action="loginhome.jsp">
			<input type="submit" class="btn btn-primary" name="action"
				value="More Shopping" />
		</form>
	</center>
</body>
</html>