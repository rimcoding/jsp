package com.tenco;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MyServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String message1 = "안녕하세요";
		String message2 = "나는 홍길동입니다.";
		String message3 = "만나서 반가워요";
		
		request.setAttribute("msg1", message1);
		request.setAttribute("msg2", message2);
		request.setAttribute("msg3", message3);
		
		RequestDispatcher dispatcher =
				request.getRequestDispatcher("result.jsp");
		
		dispatcher.forward(request, response);
				
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
