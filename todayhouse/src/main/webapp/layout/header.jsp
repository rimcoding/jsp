<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>오늘의 집</title>
<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />

<style type="text/css">

.top{
display: flex;
height: 80px;
justify-content: center;
align-items: center;
}
.top-left{
display: flex;
}
.top-left ul{
display: flex;
}
.top-left ul li{
margin: 10px;
list-style: none;
text-decoration: none;
}
.top- right{
display: flex;
}
a{
text-decoration: none;
}
.write{
height: 30px;
width: 80px;
}
</style>
</head>
<body>
<nav>
<ul></ul>
<div class = "top">
<div class = "top-left">
<h2>오늘의집</h2>
<ul>
<li>커뮤니티</li>
<li>스토어</li>
</ul>
</div>
<div class = "top-right">
<span class="material-symbols-outlined">shopping_cart</span>
<a href="login.jsp">로그인</a>
<a href="join.jsp">회원가입</a>
<button class="write">글쓰기</button>
</div>

</div>


</nav>


</body>
</html>