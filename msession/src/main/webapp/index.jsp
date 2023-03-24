<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
		// 세션을 꺼내는 방법 확인
		String username = (String)session.getAttribute("username");
		if(username == null){
			response.sendRedirect("login.jsp");			
		}

%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body{
	display: flex;
	justify-content: center;
	align-items: center;
	background-color: #E2FCB6;
}
	h1{
	margin-top: 420px;
	color: #ffff;
	}
	input{
		margin-top: 400px;
		margin-left: 10px;
		padding: 10px;
		border-radius: 5px;
		border: none;
		cursor: pointer;
		background-color: #FFFC84;
	}
	input:hover{
		background-color: #FFFED6;
	}
	
</style>
</head>
<body>
		<h1>Welcome, <%=username %>!</h1>
		
		<form action="logout.jsp">
			<input type = "submit" value="logout">
		</form>
</body>
</html>