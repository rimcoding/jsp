<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String sessionUserName = (String)session.getAttribute("username");
    	// 문제 로그인이 안되어있으면 login.jsp 페이지로 이동 시키시오 !
    	if(sessionUserName == null){
    		response.sendRedirect("login.jsp");
    	}
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>로그인 상태 이여야만 이 페이지를 보여 줍니다.</h1>
	
	<h1>로그아웃 하는 기능도 만들어 보시오</h1>
	
	<form action = "login.jsp">
		<input type = "submit" value="logout">
	</form>
</body>
</html>