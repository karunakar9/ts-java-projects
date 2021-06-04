<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
		<img src="shop.jpg" style="height: 60px; width: 60px;"
			class="rounded-circle">
		<ul class="nav">
			<li><button type="button" class="btn btn-primary"
					data-toggle="modal" data-target="#Profile">Profile</button></li>&nbsp;&nbsp;&nbsp;&nbsp;
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
					<form action="LogoutServlet" method="post">
						<input type="submit" name="action" value=NO
							class="btn btn-primary">&nbsp;&nbsp; <input type="submit"
							name="action" value=YES class="btn btn-primary">&nbsp;&nbsp;
					</form>
				</div>

			</div>
		</div>
	</div>


</body>
</html>