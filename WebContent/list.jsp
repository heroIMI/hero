<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1>${msg}</h1>
	添加:
<form action="add">
<input type="text" name="str"/>
<button>提交</button>
</form>

	<table border="1">
		<tr>
			<td>id</td>
			<td>姓名</td>
			<td>电话</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${user}" var="user" varStatus="status">
			<tr>
				<td>${user.id}</td>
				<td>${user.name}</td>
				<td>${user.phone}</td>
				<td><a href="update.jsp?id=${user.id}">修改</a> <a href="delete?id=${user.id}">删除</a></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>