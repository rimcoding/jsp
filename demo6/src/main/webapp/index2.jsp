<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!--  오류 코드가 고스란히 드러나기 때문에 숨겨야함 -->
    <!-- 만약 이 페이지에서 오류가 발생한다면 다른 곳으로 이동 시켜 -->
  <%@ page errorPage="errorPage.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String str = null;
	out.print(str.split("/"));
%>
</body>
</html>