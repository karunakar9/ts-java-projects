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
<c:set var="str" value="This Is A String"></c:set>
LC :<c:out value="${fn:toLowerCase(str) }"></c:out>
<br>
UC :<c:out value="${fn:toUpperCase(str) }"></c:out>
<br>
Index :<c:out value="${fn:indexOf(str,'I') }"></c:out>
<br>
EndsWith :<c:out value="${fn:endsWith(str,'String') }"></c:out>
<br>
Lenghth :<c:out value="${fn:length(str) }"></c:out>
<br>
SubString :<c:out value="${fn:substring(str,5,10) }"></c:out>
<br>
Trim :<c:out value="${fn:trim(str) }"></c:out>
<br>
contains:<c:out value="${fn:contains(str,'A') }"></c:out>
<br>
Replace A with 'My' in str:<c:out value="${fn:replace(str,'A','My') }"></c:out>
<br>

<c:set var="b" value="${fn:split(str,' ')}"></c:set>
<c:set var="c" value="${fn:join(b,'-')}"></c:set>
New String After Split And Join:<c:out value="${c}"></c:out>
</body>
</html>