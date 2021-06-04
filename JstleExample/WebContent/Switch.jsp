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
	<c:set var="num" value="2"></c:set>
	<c:choose>
			<c:when test="${num==1}">
			<c:out value="ONE"></c:out>
		</c:when>
			<c:when test="${num==2}">
			<c:out value="TWO"></c:out>
		</c:when>
			<c:when test="${num==3}">
			<c:out value="THREE"></c:out>
		</c:when>
			<c:when test="${num==4}">
			<c:out value="FOUR"></c:out>
		</c:when>
				<c:otherwise>None Of the above</c:otherwise>
	</c:choose>

</body>
</html>