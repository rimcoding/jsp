package com.tenco.todo.dto;

public class TodoDTO {
	private int id;
	private String title;
	private String text;
	private int priority ;
	private int completed;
	private String created_at;
	private int category_id;
	
	public TodoDTO(int id, String title, String text, int priority, int completed, String created_at, int category_id) {
		this.id = id;
		this.title = title;
		this.text = text;
		this.priority = priority;
		this.completed = completed;
		this.created_at = created_at;
		this.category_id = category_id;
	}

	@Override
	public String toString() {
		return "TotoDTO [id=" + id + ", title=" + title + ", text=" + text + ", priority=" + priority + ", completed="
				+ completed + ", created_at=" + created_at + ", category_id=" + category_id + "]";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public int getCompleted() {
		return completed;
	}
	public void setCompleted(int completed) {
		this.completed = completed;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	
	
	
}
