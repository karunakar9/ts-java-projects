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
	pageContext.setAttribute("k1", "one",pageContext.SESSION_SCOPE);
	pageContext.setAttribute("k2", "two");
	pageContext.setAttribute("k3", "three",pageContext.REQUEST_SCOPE);
	pageContext.setAttribute("k4", "four",pageContext.APPLICATION_SCOPE);
	%><br>
	
		Session:	<%=pageContext.getAttribute("k1",pageContext.SESSION_SCOPE) %><br>
		Page:		<%=pageContext.getAttribute("k2") %><br>
		Request:	<%=pageContext.getAttribute("k3",pageContext.REQUEST_SCOPE) %><br>
		Application:<%=pageContext.getAttribute("k4",pageContext.APPLICATION_SCOPE)%><br>
</body>
</html>