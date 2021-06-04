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
	<!--===============================================================================  -->
	<!-- get Products with selected category In dropDown menu -->
	<form action="FirstCryServlet" method="post">
		<div class="column">
			<div class="col-sm-3">

				<b>Select-Category</b> <select class="form-control"
					style="width: 200px;" name="category">
					<c:forEach var="obj" items="${cList}">
						<option>${obj}</option>
					</c:forEach>
				</select> &nbsp;&nbsp;
				<div>
					<button type="submit" class="btn btn-primary" name="button"
						value="GO">GO</button>
				</div>

			</div>
		</div>
	</form>
	<!--END: get Products with selected category In dropDown menu -->

	<!--==============================  -->
	<!--All Products List  -->
	<form action="FirstCryServlet" method="post">
	<center>
		<table class="table table-bordered" style="width:70%">
			<tr class="table-success">
				<th>Image</th>
				<th>Name</th>
				<th>UnitPrice</th>
				<th>Quantity</th>
			</tr>
			<c:forEach var="obj" items="${pList}">
				<tr>
				    <input type="hidden" name="itemId"  value=${obj.id}>
				    
					<td><img src="Images/${obj.imageUrl}" style="width:150px;max-height:150px"></td>
					<td>${obj.name}</td>
					<td>${obj.price}</td>
					<td><input type="number" name="quantity" value="0" min="0"
						max="50"></td>
				</tr>
			</c:forEach>
		</table>
		</center>
		<!--END:All Products List   -->
		<!-- ================================= -->

		<center>
			<input type="submit" class="btn btn-primary" name="button"
				value="ADD TO CART"></input>
		</center>

	</form>
</body>
</html>