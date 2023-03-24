<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://cdn.jsdelivr.net/npm/jquery@3.6.3/dist/jquery.slim.min.js"></script>

<!-- Popper JS -->
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
<style type="text/css">

<style type="text/css">

body{
	display: flex;
	justify-content: center;
	align-items: center;
}

form{
	border: 1px solid black;
	width: 500px;
	height: 400px;
	padding: 15px;
	border-radius: 10px;
}
.form-group{
	margin: 20px;
}

</style>
</head>
<body>
<form action = "JoinProgram" method = "post">
	<div class="form-group">
			<label for="TEXT">아이디 : </label> <input type="text" class = "form-control"
				placeholder="Id를 입력하세요" id="id1" name="id1" >
					</div>
					<div class="form-group">
				<label for="TEXT">비밀번호 : </label> <input type="password" class = "form-control"
				placeholder="password를 입력하세요" id="pwd1" name="pwd1" >
				</div>
					<div class="form-group">
				<label for="TEXT">이름 : </label> <input type="text" class = "form-control"
				placeholder="이름을 입력하세요" id="name1" name="name1" >
				</div>
				<div class="form-group">
				<input type ="submit"  class = "btn btn-outline-success" value="회원가입">
				</div>
		</form>
</body>
</html>