<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//invalidate 저장했던 객체를 날려버림
	session.invalidate();	//로그아웃 -> 세션 메모리에서 해제
	response.sendRedirect("login.jsp"); 	//로그아웃 이후 페이지 이동
	
%>