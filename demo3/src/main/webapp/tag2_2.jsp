<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@page import="java.util.TimeZone"%>
<%@page import="java.util.Date"%>

<jsp:include page="/layout/header.jsp"/>

<style>
main{
		
		display: flex;
		padding: 20px;
		flex-direction: column;
		align-items: center;	
		justify-content: flex-start;
		
}
main pre{
	
	width: 100%;
	border: 1px solid black;
	padding: 20px;
	
	
}

</style>
<main>
<pre>
	222
	선언문(declaration)
	<%! %><-- 태그로 표현합니다.
	JSP 페이지에서 전역변수, 메서드, 클래스등을 선언할 수 있습니다.
	스크립트릿과 달리, JSP 페이지에서 직접 호출 할 수 없습니다.
	---------------------------------------
	선언문과 표현식 연습
	현재 시간은 한국 표기법으로 <%=getKoreanTime() %>
</pre>
</main>

<%!
public String getKoreanTime(){
	TimeZone.setDefault( TimeZone.getTimeZone("Asia/Seoul"));
	
	Date now = new Date();
	System.out.println(System.currentTimeMillis());
	String timeStr = String.format("%tY년 %tm월 %td일 %tT",now ,now ,now ,now);
	return timeStr;
}
%>


<jsp:include page="/layout/footer.jsp"/>