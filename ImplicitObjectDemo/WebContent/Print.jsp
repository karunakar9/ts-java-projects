<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String name=(String)request.getAttribute("n");
	String id=(String)request.getAttribute("i");
	out.println(request.getAttribute("n"));
	out.println(request.getAttribute("i"));
	
	response.sendRedirect("hello.jsp?Id="+id+"&Name="+name);
	%>
</body>
</html>