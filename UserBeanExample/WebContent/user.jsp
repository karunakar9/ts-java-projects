<%@page import="com.bean.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="obj" class="com.bean.User"></jsp:useBean><!-- instantiating bean class -->
	<jsp:setProperty property="id" name="obj"/>
	<jsp:setProperty property="name" name="obj"/>
	<jsp:setProperty property="cmpny" name="obj"/>
	
	<!--<jsp:setProperty property="*" name="obj"/>-->
	
	
	Id is:   <jsp:getProperty property="id" name="obj"/><br>
	Name :<jsp:getProperty property="name" name="obj"/><br>
	company:<jsp:getProperty property="cmpny" name="obj"/><br>
	
	<!-- another way of getting data --><br>
	another way of getting data<br>
	<%
	String a=(String)request.getParameter("id");
	String b=(String)request.getParameter("name");
	String c=(String)request.getParameter("cmpny");
	
	out.println(a);
	out.println(b);
	out.println(c);
	
	%>
</body>
</html>