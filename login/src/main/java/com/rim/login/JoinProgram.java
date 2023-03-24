package com.rim.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rim.login.dto.DTO;
@WebServlet("/JoinProgram")
public class JoinProgram extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DAO dao;
	private DTO dto;
    public JoinProgram() {
    	dao = new DAO();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("dopost작동");
		request.setCharacterEncoding("utf-8");
		String id1 = request.getParameter("id1");
		String pwd1 = request.getParameter("pwd1");
		String name1 = request.getParameter("name1");
		dao.Join(id1, pwd1, name1);
		
		System.out.println("id :" +id1);
		System.out.println("password :"+ pwd1);
		System.out.println("name : " +name1);
	}
	

}
