<%@page import="java.beans.Customizer"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="com.servlet.Customer"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
 	Customer c1= new Customer();
 	c1.setName("mothilal");
 	c1.setPhnNo(98765432l);
 	c1.setCity("hyd");
 	
 	request.setAttribute("cObj", c1);
 %>
 <!-- Accessing properties -->
 <c:forEach var="customerObj" items="${custList }">
 <c:out value="${cObj.name }"></c:out>
 <c:out value="${cObj.setPhnNo(phnNo) }"></c:out>
 <c:out value="${cObj.city }"></c:out>
</c:forEach>
</body>
</html>