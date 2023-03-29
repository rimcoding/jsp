<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="LoginProgram" method="post">
	<div>
	<label for ="TEXT">이메일</label><input type = "email" placeholder="이메일을 입력하세요" name = "email" id ="email"><br>
	<label for ="TEXT">비밀번호</label><input type = "password" placeholder="비밀번호를 입력하세요" name = "password" id = "password"><br>
	<input type = "submit" class="btn btn-outline-success"  value="로그인">
	</div>
	</form>
</body>
</html>