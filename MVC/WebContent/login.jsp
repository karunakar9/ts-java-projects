<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="LoginServlet" method="post">

Enter mail:<input type="email" name="mail"/>
<br>
Enter Password:<input type="password" name="pwd"/>
<br>
<input type="submit" name="action" value="Login"/>

</form>
<form action="signup.jsp" method="post">
<input type="submit" name="action" value="Register">
</form>

</body>
</html>