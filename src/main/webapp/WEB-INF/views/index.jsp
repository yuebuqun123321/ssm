<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<% 
	//设置开句对路径
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<!-- 引入Bootstrap js和css -->
	<link rel="stylesheet" href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.css">
</head> 
<body>
	<table class="table table-bordered" style="width:700px;text-align: center;margin: auto;margin-top: 50px;">
		<tr>
			<th>EmpId</th>
			<th>EmpName</th>
			<th>Gender</th>
			<th>Email</th>
			<th>Department</th>
			<th>编辑</th>
			<th>删除</th>
		</tr>
		<c:forEach  items="${emps }" var="emp">
			<tr>
				<td>${emp.empId }</td>
				<td>${emp.empName }</td>
				<td>${emp.gender }</td>
				<td>${emp.email }</td>
				<td>${emp.deptName }</td>
				<td><a href="#" class="btn btn-success">编辑</a></td>
				<td><a href="#" class="btn btn-danger">删除</a></td>
			</tr>
		</c:forEach>
	</table>
	<a style="margin-left: 600px;margin-top: 50px;" href="${APP_PATH }/toAddPage" class="btn btn-primary">添加新员工</a>
</body>
</html>
<script type="text/javascript" src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.js"></script>
<script type="text/javascript" src="${APP_PATH }/static/js/jquery-1.12.4.min.js"></script>