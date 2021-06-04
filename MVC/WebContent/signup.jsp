<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="LoginServlet" method="post"
		style="background-color: aqua; height: 300px; width: 350px">
		<br> 
		Enter Name:<input type="name" name="sname" /> <br>
		Enter mail:<input type="email" name="smail" /> <br> 
		Enter Password:<input type="password" name="spwd" /> <br> <input
		type="submit" name="action" value="Register" />
	</form>


</body>
</html>