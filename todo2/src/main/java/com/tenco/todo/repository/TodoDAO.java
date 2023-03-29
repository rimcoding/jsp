package com.tenco.todo.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.tenco.todo.dto.TodoDTO;
import com.tenco.todo.utils.DbHelper;

public class TodoDAO implements ITodoRepo {

	
	private DbHelper dbHelper;
	private Connection conn;
	
	public TodoDAO() {
		dbHelper = new DbHelper();
		conn = dbHelper.getConnection();
	}
	
	@Override
	public ArrayList<TodoDTO> select() {
		
		ArrayList<TodoDTO> list = new ArrayList<>();
		String strQuery = "  SELECT * from todolist ";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(strQuery);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int id = rs.getInt("id");
				String title = rs.getString("title");
				String text = rs.getString("decription");
				int priority = rs.getInt("priority");
				int completed = rs.getInt("completed");
				String created_at = rs.getString("created_at");
				int category_id = rs.getInt("category_id");
				TodoDTO dto = new TodoDTO(id, title, text, priority, completed, created_at, category_id);
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
		
	}

	@Override
	public int insert(String title,String decription) {
		int resultcount = 0;
		String queryStr = " INSERT INTO todolist(title,decription) "
				+ " VALUES "
				+ "    ( ? , ? ) ";
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(queryStr);
			pstmt.setString(1, title);
			pstmt.setString(2, decription);
			resultcount = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return resultcount;
	}

	@Override
	public int update(String title,String decription) {
		int resultRowCount = 0;
		String queryStr = " UPDATE todolist SET title = ? WHERE decription = ? ";
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(queryStr);
			pstmt.setString(1, title);
			pstmt.setString(2, decription);
			resultRowCount = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return resultRowCount;
	}

	@Override
	public int delete(String title) {
		int resultRowCount = 0;
		String queryStr = " DELETE FROM todolist WHERE title = ? ";
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(queryStr);
			pstmt.setString(1, title);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return resultRowCount;
	}
		
}
