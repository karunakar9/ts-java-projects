<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:out value="${'Welcome to jsp' }"/>
	<br>
	<h1><c:out value="introduction to JSTL tags"></c:out></h1>


		<c:set var="age" value="16" scope="session" > </c:set><!-- initialization -->
		
		<c:if test="${age>18}">
		<c:out value="${'Eligible' }"></c:out>
		</c:if>
		
		<c:if test="${age<=18}">
		<c:out value="${'Not Eligible' }"></c:out>
		</c:if>
		
		<jsp:include page="ex2.jsp"></jsp:include>
</body>
</html>