package com.tenco.todo.repository;

import java.util.ArrayList;

import com.tenco.todo.dto.TodoDTO;

public interface ITodoRepo {
	
	ArrayList<TodoDTO> select();
	int insert(int id, String title,String decription, int priority, int completed);
	void update();
	void delete();
}
