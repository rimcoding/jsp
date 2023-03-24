package com.tenco.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/loginproc")
public class Loginproc extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	public Loginproc() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	//method : post (form 태그에서)
	//http://localhost:8080/demo2/loginProca@nate.com
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// form -> 반드시 속성 name ="email" -> value = "a@naver.com
		request.setCharacterEncoding("utf-8");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String isRemember = request.getParameter("isRemember");
		String hobby = request.getParameter("hobby");
		String[] likes = request.getParameterValues("like");	//배열처리 (다중 선택)

		System.out.println("email : "+ email);
		System.out.println("password : "+ password);
		System.out.println("isRemember : "+ isRemember);
		System.out.println("hobby : "+ hobby);
		if (likes != null) {
			for (String like : likes) {
				System.out.println("like : " + like);
		}
		
		}
		
	}

}
