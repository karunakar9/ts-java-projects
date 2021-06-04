<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
Method:1<br>
	
	<br>Method:2<br>
	<c:forEach var="obj"  items="${map}" >
	key:<c:out value="${obj.key }" ></c:out><br>
	value:<c:out value="${obj.value }" ></c:out><br>
	</c:forEach>

</body>
</html>