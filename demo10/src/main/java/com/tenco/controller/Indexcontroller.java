package com.tenco.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/inc")
public class Indexcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Indexcontroller() {
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// http://localhost:8080/demo10/inc?name=홍길동&pw=1234
		String username = request.getParameter("name");
		String pw = request.getParameter("pw");
		
		System.out.println("username : " + username);
		System.out.println("pw" + pw);
		
		//GET 방식에 대한 복습
		// 1. 콘솔에 한글 안 깨짐
		// 2. 응답시 한글 깨짐 (해결방법 - setContentType 설정 하기)
		
//		response.setContentType("text/html; charset=UTF-8");
//		PrintWriter out = response.getWriter();
//		out.print("username" + username);
//		out.print("<br>");
//		out.print("pw : " + pw);
		//index.jsp
		//path : URI 개념 (URL)
		// docBase = 폴더 경로 - > 루트 경로 : webapp
		// 보안 상으로 바로 접근할 수 없어서 forward 방식으로 처리를 한다.
		request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//post 방식
		// 1. 요청으로 들어온 값 콘솔 창 한글 깨짐 (해결방안 : 	request.setCharacterEncoding("UTF-8"); )
		// 2. 응답시 한글 깨짐 (해결 방안 response.setContentType("text/html; charset=UTF-8"); )
		//request.setCharacterEncoding("UTF-8");
		
		String username = request.getParameter("username");
		String pw = request.getParameter("pw");
		
		System.out.println("username : " + username);
		System.out.println("pw" + pw);
		
		//응답 처리
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("사용자 이름 : " + username );
		out.print("<br>");
		out.print("비번 : " + pw );
		
	}

}
