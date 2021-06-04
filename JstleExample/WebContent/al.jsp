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
	<%
	ArrayList<String> al1=(ArrayList<String>)request.getAttribute("namesList");
	for(String obj:al1){
		out.println(obj);
	}
	%>
	<br>Method:2<br>
	<c:forEach var="i"  items="${ namesList}" >
	<c:out value="${i }" ></c:out>
	</c:forEach>

</body>
</html>