<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.*"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Todo List</h2>
<table>
	<tr>
	<th>id</th>
	<th>title</th>
	<th>decription</th>
	<th>priority</th>
	<th>completed</th>
	<th>created_at</th>
	<th>category_id</th>
	</tr>
	
	<c:forEach var="todolist"  items="${list}">
	<tr>
	<td>${todolist.id}</td>
	<td>${todolist.title}</td>
	<td>${todolist.text}</td>
	<td>${todolist.priority}</td>
	<td>${todolist.completed}</td>
	<td>${todolist.created_at}</td>
	<td>${todolist.category_id}</td>
	</tr>
	</c:forEach>
	
</table>
</body>
</html>