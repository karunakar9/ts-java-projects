<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>conflict demo</title>
</head>
<body>
 <%=config.getInitParameter("Tname") %>
 <br>
 <%=page %>
 <%@ include file="Student.html" %>
 <jsp:include page="Student.html"></jsp:include>

</body>
</html>