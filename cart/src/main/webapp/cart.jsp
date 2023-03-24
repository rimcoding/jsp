<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="cartProc.jsp" method="post">
	<label>사과</label>
	<input type = "checkbox" name = "fruit" value="apple">
	<label>바나나</label>
	<input type = "checkbox" name = "fruit" value="banana">
	<label>복숭아</label>
	<input type = "checkbox" name = "fruit" value="peach">
	<input type = "submit" name="commit"  value="cart">
	<input type = "submit" name = "delete" value="delete">
	</form>
</body>
</html>