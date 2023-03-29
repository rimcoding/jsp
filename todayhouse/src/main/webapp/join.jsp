<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="JoinProgram" method="post">
	<div class="form-group">
	<label for="TEXT">이메일 : </label><input type="email" placeholder="이메일을 입력하세요"  name="email" id = "email"><br>
	<label for="TEXT">비밀번호 : </label><input type="password" placeholder="패스워드를 입력하세요"  name="password" id="password"><br>
	<label for="TEXT">닉네임 : </label><input type="text" placeholder="닉네임을 입력하세요"  name="nickname" id = "nickname"><br>
	<input type = "submit"  class = "btn btn-outline-success" value="회원가입">
	</div>
</form>
</body>
</html>