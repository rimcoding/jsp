<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/layout/header.jsp"/>
<style>
main{
		height:300px;
        display:flex;
        flex-direction: flex-start;
        justify-content: flex-start;
        align-items: center;
        
}
h1{
	margin-top: 30px;
	margin-bottom: 10px;
	font-size: 28px;
	font-weight: bold;
	text-align: center;
	
}
a{
text-decoration: none;
color: balck;
}
</style>
<main>
	<h1> 덧셈 게임 </h1>
	<%
		if(request.getParameter("answer") != null){
			
			int answer = Integer.parseInt(request.getParameter("answer"));
			int guess = Integer.parseInt(request.getParameter("guess"));
			
			if(answer == guess){
				out.print("<p>축하합니다 ! 정답입니다.</p>");
			}else{
				out.print("<p>아쉽지만 틀렸습니다.. 다시 도전해보세요.</p>");
			}
			
		}
	
	%>
	<br>
	<div>
	<a href="/demo3/tag5.jsp">문제 더풀어보기</a>
	</div>
</main>


<jsp:include page="/layout/footer.jsp"/>