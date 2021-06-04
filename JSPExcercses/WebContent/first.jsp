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
		out.println("Hello Jsp are you ready!");
	      
	%>
	<%!int num = 6;

	public boolean checkPerfectNum(int num) {
		int sum = 0;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				sum = sum + i;
			}

		}
		if (sum == num) {
			return true;
		}
		return false;
	}%>
	
	<%-- <br>
	<jsp:include page="second.jsp"></jsp:include>
	<br> --%>
	
	Given number is : <%=checkPerfectNum(num)%>

</body>
</html>