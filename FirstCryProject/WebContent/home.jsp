<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

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
<title>FirstCryProject</title>
<style type="text/css">
</style>
</head>
<body>
	<!-- NavBar -->
	<nav class="navbar bg-success">
	<div class="container">
		<img src="Images/fc.png" style="height: 60px; width: 60px;"
			class="rounded-circle">
		<ul class="nav">
			<li><button type="button" class="btn btn-primary"
					data-toggle="modal" data-target="#Login">Login</button></li>&nbsp;&nbsp;&nbsp;&nbsp;
			<li><button type="button" class="btn btn-primary"
					data-toggle="modal" data-target="#signup">SignUp</button></li>&nbsp;&nbsp;&nbsp;&nbsp;
		</ul>

	</div>
	</nav>
	<!-- NavBarEnds -->
	<!-- Signup -->
	<div class="modal" id="signup">
		<div class="modal-dialog">
			<div class="modal-content">

				<!-- Modal Header -->
				<div class="modal-header">
					<h4 class="modal-title">Enter Registration details</h4>
					<button type="button" class="close" data-dismiss="modal">&times;</button>
				</div>

				<!-- Modal body -->
				<div class="modal-body">
					<form action="FirstCryServlet" method="post">
						fullname:
						<div class="form-group">
							<input type="text" name="name" class="form-control col-sm-4">
						</div>
						email:
						<div class="form-group">
							<input type="email" name="mail" class="form-control col-sm-4">
						</div>
						<br> password:
						<div class="form-group">
							<input type="password" name="password"
								class="form-control col-sm-4">
						</div>
						<br>
				</div>

				<!-- Modal footer -->
				<div class="modal-footer">
					<input type="submit" name="button" value=Register
						class="btn btn-primary">
					</form>
				</div>

			</div>
		</div>
	</div>
	<!-- signUp Ends -->
	<!-- Login -->
	<div class="modal" id="Login">
		<div class="modal-dialog">
			<div class="modal-content">

				<!-- Modal Header -->
				<div class="modal-header">
					<h4 class="modal-title">Enter Login details</h4>
					<button type="button" class="close" data-dismiss="modal">&times;</button>
				</div>

				<!-- Modal body -->
				<div class="modal-body">
					<form action="FirstCryServlet" method="post">

						email:
						<div class="form-group">
							<input type="email" name="lmail" class="form-control col-sm-4">
						</div>
						<br> password:
						<div class="form-group">
							<input type="password" name="lpassword"
								class="form-control col-sm-4">
						</div>
						<br>
				</div>

				<!-- Modal footer -->
				<div class="modal-footer">
					<input type="submit" name="button" value=Login
						class="btn btn-primary">
					</form>
				</div>

			</div>
		</div>
	</div>
	<!-- Login ends -->
	<!--  -->
	<h1>
		<center>OUR SERVICES</center>
	</h1>
	<!--  -->
	<!-- Carousel images -->

	<div id="demo" class="carousel slide" data-ride="carousel">

		<!-- Indicators -->
		<ul class="carousel-indicators">
			<li data-target="#demo" data-slide-to="0" class="active"></li>
			<li data-target="#demo" data-slide-to="1"></li>
			<li data-target="#demo" data-slide-to="2"></li>
		</ul>

		<!-- The slideshow -->

		<div class="carousel-inner">
			<div class="carousel-item active">

				<div class="row">
					<div class="col-sm-4">
						<img src="Images/co1.jpeg" style="height: 200px; width: 350px">
					</div>
					<div class="col-sm-4">
						<img src="Images/co2.jpeg" style="height: 200px; width: 350px">
					</div>
					<div class="col-sm-4">
						<img src="Images/co3.jpg" style="height: 200px; width: 350px">
					</div>


				</div>
			</div>
			<div class="carousel-item">
				<div class="row">
					<div class="col-sm-4">
						<img src="Images/co4.jpeg" style="height: 200px; width: 350px">
					</div>
					<div class="col-sm-4">
						<img src="Images/co5.jpeg" style="height: 200px; width: 350px">
					</div>
					<div class="col-sm-4">
						<img src="Images/co6.jpeg" style="height: 200px; width: 350px">
					</div>

				</div>
			</div>
			<div class="carousel-item">
				<div class="row">
					<div class="col-sm-4">
						<img src="Images/co7.jpeg" style="height: 200px; width: 350px">
					</div>
					<div class="col-sm-4">
						<img src="Images/co8.jpeg" style="height: 200px; width: 350px">
					</div>
					<div class="col-sm-4">
						<img src="Images/co9.jpeg" style="height: 200px; width: 350px">
					</div>
				</div>
			</div>

			<!-- Left and right controls -->
			<a class="carousel-control-prev" href="#demo" data-slide="prev">
				<span class="carousel-control-prev-icon"></span>
			</a> <a class="carousel-control-next" href="#demo" data-slide="next">
				<span class="carousel-control-next-icon"></span>
			</a>
		</div>
	</div>
	<!-- =================================Corousel ends================================================= -->
	<br>
	

	<!--START: get Products with selected category In dropDown menu -->
	
		<form action="FirstCryServlet" method="post">
			<div class="column">
				<div class="col-sm-3">
	
					<b>Select-Category</b>
					<select class="form-control" style="width: 200px;" name="category">
						<c:forEach var="obj" items="${cList}">
							<option>${obj}</option>
						</c:forEach>
					</select> &nbsp;&nbsp;
					<div>
						<button type="submit" class="btn btn-primary" name="button" value="Go">Go</button>
					</div>
	
				</div>
			</div>
		</form>
	<!--END: get Products with selected category In dropDown menu -->
	
	<!--==============================  -->
	<!--All Products List  -->
	<center>
	<table class="table table-bordered" style="width:70%">
		<tr class="table-success">
			<th>Image</th>
			<th>Name</th>
			<th>UnitPrice</th>
		</tr>
		<c:forEach var="obj" items="${pList}">
			<tr>
				<td><img src="Images/${obj.imageUrl}" style="width:150px;max-height:150px"></td>
				<td>${obj.name}</td>
				<td>${obj.price}</td>
			</tr>
		</c:forEach>
	</table>
	</center>
	<!--END:All Products List   -->
	<!-- ================================= -->
	


</body>
</html>
