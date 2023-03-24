package com.tenco.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//어노테이션으로 간단하게 표시할수 있다.
@WebServlet("/usercontroller")
public class Usercontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Usercontroller() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//문제 2
		// JSON 형식으로 name = 홍길동, age = 10 이라는 값을 리턴시키세요.
		
		response.setContentType("application/json");
		request.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		out.print("{\r\n"
				+ "	\"name\" : \"홍길동\",\r\n"
				+ "	\"age\" : 25\r\n"
				+ "}");


		
	}

	// Method : post
	// http://localhost:8080/blog/usercontroller
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// form 태그에서 넘어오는 값들을 받아보고 ?? 연산을 해서 응답 처리를 해보자
		// 요청시 파라미터로 넘겨온 키값을 확인해서 값을 추출하는 기술을 알아 보자.
		
		// 한글이 깨지지 않게 보내줌
		request.setCharacterEncoding("UTF-8");
		
		String name = request.getParameter("name");
		String pwd = request.getParameter("password");
		
		System.out.println("name : " + name);
		System.out.println("pwd : " + pwd);
		
		//응답 처리
		// MIME TYPE text/html 방식 -> 이름과 비번을 확인 하였습니다.
		
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html; charset-utf-8; ");
		request.setCharacterEncoding("UTF-8");
		out.print("<!DOCTYPE html>");
		out.print("<html>");
		out.print("<head>");
		out.print("</head>");
		out.print("<body>");
		out.print("<section>");
		out.print("<p>");
		out.print("이름과 비번을 확인하였습니다.");
		out.print("</p>");
		out.print("</section>");
		out.print("</body>");
		out.print("</html>");
		
	}

}
