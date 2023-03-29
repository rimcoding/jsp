package com.tenco.todo.repository;

import java.util.ArrayList;

import com.tenco.todo.dto.TodoDTO;

public interface ITodoRepo {
	
	ArrayList<TodoDTO> select();
	int insert(String title,String decription);
	int update(String title,String decription);
	int delete(String title);
}
