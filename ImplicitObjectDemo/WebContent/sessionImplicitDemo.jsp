<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Session implicit demo title</title>
</head>
<body>
	Session Id:
	<%=session.getId()%><br>
	
	Session Last Accesed:
	<%=session.getLastAccessedTime() %><br>
	
	session creation Time:
	<%=session.getCreationTime() %><br>
	
		<%
		session.setAttribute("name", "mothilal");
		session.setAttribute("name", "sammer");
		%><br>
		
		session Data:
		<%=session.getAttribute("name") %><br>
		
		<%session.invalidate(); %>
		
			<jsp:include page="session2.jsp"></jsp:include>
		

</body>
</html>