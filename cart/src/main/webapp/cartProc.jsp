<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    //name
    String[] fruits = request.getParameterValues("fruit");
    String[] names ={"사과","바나나","복숭아"};
    //방어적 코드
    
    if(fruits != null && fruits.length > 0){
    	// 사용자가 체크 박스를 하나 이상 선택한 경우
    	for(int i= 0; i < fruits.length; i++){
    		//String countParam = fruit + ": count";
    		Cookie cookie = new Cookie(names[i], "on");
    	}
    }
    
    
    String isDelete = request.getParameter("delete");
	if(isDelete != null){
		if(isDelete.equals("delete")){
			
		}
	}
	out.println("isDelete"+isDelete);
%>