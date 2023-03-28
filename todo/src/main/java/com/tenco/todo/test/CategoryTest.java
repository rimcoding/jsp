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

import com.tenco.todo.dto.CategoryDTO;
import com.tenco.todo.repository.CategoryDAO;
import com.tenco.todo.utils.DbHelper;

@WebServlet("/cTest")
public class CategoryTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	public void init() throws ServletException {
		// todo - DB 연결  확인후 삭제
		//DbHelper dbHelper = new DbHelper();
		//dbHelper.getConnection();	//DB연결 완료
	}
	
    public CategoryTest() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CategoryDAO dao = new CategoryDAO();
		//주소 설계
		//http://localhost:8080/todo/cTest?action=delete&cid=1
		String action = request.getParameter("action");
		if ("delete".equals(action)) {
			String cid = request.getParameter("cid");
			dao.delete(Integer.parseInt(cid));
			response.sendRedirect("/todo/cTest");
		}else {
			ArrayList<CategoryDTO>resultList = dao.select();
			request.setAttribute("list", resultList);
			RequestDispatcher dis = request.getRequestDispatcher("test/categorylist.jsp");
			dis.forward(request, response);
		}
		
		//a 링크 <-- get
//		response.setContentType("text/html; charset=utf-8; ");
//		System.out.println(result.toString());
//		PrintWriter out = response.getWriter();
//		out.print(result);
		// 문제
		//목적지 list2.jsp -> jstl 사용해서 출력해주세요.
//		request.setAttribute("list", resultList);	//request 객체에 값 셋팅
//		RequestDispatcher dispatcher = request.getRequestDispatcher("test/categorylist.jsp");
//		dispatcher.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		//쿼리 파라메터 방식 데이터 받아 보기
		//insert update
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		CategoryDAO categoryDAO = new CategoryDAO();
		
			
		String action = request.getParameter("action");
		int responseCount = 0;
		if (action.equals("update")) {
			String id = request.getParameter("id");
			responseCount = categoryDAO.update(Integer.parseInt(id), name);
		}else if(action.equals("insert")) {
			responseCount = categoryDAO.insert(name);
		}
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/plain");
		PrintWriter out = response.getWriter();
		out.print("저장된 갯수 확인 : " + responseCount);
		//method - post 요청시에 동작하는 메서드
	
		
	}

}
