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
	<%
	String[][] emp={{"id","Name","sal"},{"100","sai","12000"},{"101","sameer","13000"}};
	request.setAttribute("empDetails", emp);
	%>

	<c:forEach var="list" items="${empDetails}">
		<c:out value="${list[0]}"></c:out>&nbsp;&nbsp;
	 	<c:out value="${list[1]}"></c:out>&nbsp;&nbsp;
	 	<c:out value="${list[2]}"></c:out>
		<br>
	</c:forEach>
	<br>
	<!-- Alternate way -->
	<c:forEach var="list" items="${empDetails}">
		<c:forEach var="obj" items="${list}">
		<c:out value="${obj}"></c:out>&nbsp;&nbsp;
	 	 	</c:forEach>
	<br>
	</c:forEach>

</body>
</html>