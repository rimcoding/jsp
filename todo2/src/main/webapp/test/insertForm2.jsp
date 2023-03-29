<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Todo insert form</h1>
<form action="/todo2/todoTest?action=insert" method="post">
<input type = "text" name ="title" required="required" placeholder="title varchar"><br>
<input type = "text" name ="decription" required="required" placeholder="decription text"><br>
<input type="submit" value="todo저장">
</form>
</body>
</html>