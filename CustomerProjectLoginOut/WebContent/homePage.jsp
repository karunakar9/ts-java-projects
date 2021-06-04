<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
	<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
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
	<!-- NavBar -->
	<nav class="navbar bg-success">
	<div class="container">
		<img src="shop.jpg" style="height: 60px; width: 60px;"
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
					<form action="CustomerServlet" method="post">
						fullname:
						<div class="form-group">
							<input type="text" name="name" class="form-control col-sm-4">
						</div>
						DOB:
						<div class="form-group">
							<input type="text" name="dateofbirth"
								class="form-control col-sm-4">
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
					<form action="CustomerServlet" method="post">

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

</body>
</html>
