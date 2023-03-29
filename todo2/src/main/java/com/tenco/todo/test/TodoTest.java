package com.tenco.todo.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tenco.todo.dto.TodoDTO;
import com.tenco.todo.repository.TodoDAO;
import com.tenco.todo.utils.DbHelper;

@WebServlet("/todoTest")
public class TodoTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
    public TodoTest() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TodoDAO dao = new TodoDAO();
		response.setContentType("text/html; charset=utf-8; ");
		String action = request.getParameter("action");
		if ("delete".equals(action)) {
			String ctitle = request.getParameter("ctitle");
			dao.delete(ctitle);
		}else {
			ArrayList<TodoDTO>resultList = dao.select();
			request.setAttribute("list", resultList);
			RequestDispatcher dis = request.getRequestDispatcher("test/todolist.jsp");
			dis.forward(request, response);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	request.setCharacterEncoding("UTF-8");
	String title = request.getParameter("title");
	String decription = request.getParameter("decription");
	TodoDAO dao = new TodoDAO();

	String action = request.getParameter("action");
	int responseCount = 0;
	if (action.equals("insert")) {
		responseCount = dao.insert(title, decription);
	}else if(action.equals("update")){
		responseCount = dao.update(title, decription);
	}
	System.out.println(title);
	System.out.println(decription);
	response.setCharacterEncoding("UTF-8");
	response.setContentType("text/plain");
	PrintWriter out = response.getWriter();
	out.print("저장된 갯수 확인 : " + responseCount);
	}

}
