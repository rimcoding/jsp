<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Loop Example</title>
</head>
<body>
	<c:set var="count" value="0" />
	<c:forEach var="category" items="${list}">
	<c:set var="count" value="${count +1}"></c:set>
	<c:out value="${count}"  />
	</c:forEach>
</body>
</html>