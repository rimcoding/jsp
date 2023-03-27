<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%

String messge1 = (String)request.getAttribute("msg1");
String messge2 = (String)request.getAttribute("msg2");
String messge3 = (String)request.getAttribute("msg3");
%>
<p><%=messge1 %></p>
<p><%=messge2 %></p>
<p><%=messge3 %></p>
</body>
</html>