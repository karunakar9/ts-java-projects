<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>exception implicit demo</title>
</head>
<body>
	<%
	int[] arr=new int[2];
	arr[5]=8;
	
		int a=10,b=0;
		int c=a/b;
		out.println(c);
	%>

</body>
</html>