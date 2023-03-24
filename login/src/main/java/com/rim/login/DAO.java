package com.rim.login;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.rim.login.dao.IDTO;
import com.rim.login.dto.DTO;
import com.rim.login.utils.DbHelper;

public class DAO implements IDTO {
	private DbHelper dbHelper;
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public DAO() {
		dbHelper = new DbHelper();
		conn = dbHelper.getConnection();
	}

	@Override
	public int Join(String id, String password, String name) {
		System.out.println("1");
		int row = 0;
		String query = " INSERT INTO member "
				+ " VALUES "
				+ " ( ? , ? , ? ) ";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1,id);
			pstmt.setString(2,password);
			pstmt.setString(3,name);
			row = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Dao에서 에러발생");
			e.printStackTrace();
		}
		
		return row;
	}
	
}
