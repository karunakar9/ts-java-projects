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
	Printing numbers from 1 to10 in jstl:
	<br>

	<c:forEach var="i" begin="1" end="10" varStatus="st">
		<c:out value="${i}"></c:out>
		<br>
	</c:forEach>

	Printing even numbers:
	<br>
	<c:forEach var="i" begin="0" end="10" step="2">
		<c:out value="${i}"></c:out>
		<br>
	</c:forEach>

	Printing odd numbers:
	<br>
	<c:forEach var="i" begin="1" end="10" step="2">
		<c:out value="${i}"></c:out>
		<br>
	</c:forEach>

	Using varStatus finding index,count,first,last:
	<br>

	<c:forEach var="i" begin="23" end="34" varStatus="st">
	 	
	 		Index:<c:out value="${st.index }"></c:out>
		<br>
	 		
	 		Current:<c:out value="${st.current }"></c:out>
		<br>
	 		
	 		Count:<c:out value="${st.count }"></c:out>
		<br>
	 		
	 		Begin:<c:out value="${st.begin }"></c:out>
		<br>
	 		
	 		End:<c:out value="${st.end }"></c:out>
		<br>

		<c:if test="${st.first }">
			<c:out value="${i}"></c:out>
		</c:if>
	 		
	 		
		Print:<c:out value="${i}"></c:out>
		<br>
		===============================
		<br>
	</c:forEach>

</body>
</html>