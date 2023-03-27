<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%
	String path = request.getContextPath();
%>
<body>
	<a href="<%=path  %>/">Home</a>&nbsp;&nbsp;&nbsp;&nbsp;
	<a href="<%=path  %>/">LogIn</a>&nbsp;&nbsp;&nbsp;&nbsp;
	<a href="<%=path  %>/">Join</a>&nbsp;&nbsp;&nbsp;&nbsp;
	<a href="<%=path  %>/">Guests Book</a>&nbsp;&nbsp;&nbsp;&nbsp;
	<a href="<%=path  %>/">BOARD</a>&nbsp;&nbsp;&nbsp;&nbsp;
	<a href="<%=path  %>/">NOTICE</a>&nbsp;&nbsp;&nbsp;&nbsp;
</body>
</html>