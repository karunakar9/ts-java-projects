<%@page import="com.dao.StudentDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.model.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
	
	<%-- <c:forEach var="obj" items="${studentList}">  
   <c:out value="${obj.getId()}" />
   <c:out value="${obj.getName()}" />
   <c:out value="${obj.getBatch()}" />
   <br>
	</center>
	</c:forEach> --%>
	<!-- =================== --></center>
	<div class="container">
  <h2>Student Details with ID</h2>
              
  <table class="table table-dark table-hover">
    <thead>
      <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Batch</th>
        <th>Perform</th>
      </tr>
    </thead>
    <tbody>
   <%--   <c:forEach var="obj" items="${studentList}">
      <tr>
        <td><c:out value="${obj.getId()}" /></td>
        <td> <c:out value="${obj.getName()}" /></td>
        <td><c:out value="${obj.getBatch()}" /></td>
      </tr>
      </c:forEach> --%>
      <!--==================================================  -->
       <c:forEach var="obj" items="${studentList}">
      
      <tr>
       <form action="StudentServlet" method="post">
       <input type="hidden" name="sid" value="<c:out value="${obj.getId()}" />">
        <td><c:out value="${obj.getId()}" /></td>
        <td><input type="text" name="sname" value="<c:out value="${obj.getName()}" />"></td>
        <td><input type="text" name="sbatch" value="<c:out value="${obj.getBatch()}" />"></td>
        <td> <input type="submit" name="bt" value="Update" class="btn btn-primary" >
        <input type="submit" name="bt" value="Delete" class="btn btn-primary" >
        </td>
         </form>
      </tr>
     
      </c:forEach>
    </tbody>
  </table>
</div>
	<!-- ============================= -->
	<!-- <form action="StudentServlet" method="post" align="center">
		Enter Student Id:
		<div class="form-group" align="center">
			<input type="number" name="sid" value=""
				class="form-control col-sm-3"><br> <br>
		</div>
		Enter Student Name:
		<div class="form-group" align="center">
			<input type="text" name="sname" value=""
				class="form-control col-sm-3"><br> <br>
		</div>

		Enter Student Batch:
		<div class="form-group" align="center">
			<input type="text" name="sbatch" class="form-control col-sm-3"><br>
			<br>

		</div>
		&nbsp &nbsp
		 <input type="submit" name="bt" value="Add"
			class="btn btn-primary"> &nbsp &nbsp 
			<input type="submit"
			name="bt" value="Update" class="btn btn-primary"> &nbsp &nbsp

		<input type="submit" name="bt" value="Delete" class="btn btn-primary">


	</form> -->
	

</body>
</html>