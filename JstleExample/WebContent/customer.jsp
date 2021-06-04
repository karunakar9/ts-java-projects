<%@page import="com.servlet.Customer"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
 	Customer c= new Customer();
 	c.setName("mothilal");
 	c.setPhnNo(98765432l);
 	c.setCity("hyd");
 	request.setAttribute("cObj", c);
 %>
 <!-- Accessing properties -->
 <c:out value="${cObj.name }"></c:out>
 <c:out value="${cObj.setPhnNo(phnNo) }"></c:out>
 <c:out value="${cObj.city }"></c:out>
</body>
</html>