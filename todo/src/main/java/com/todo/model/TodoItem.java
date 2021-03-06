package com.todo.model;


import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class TodoItem {

	 @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer todoItemId;

	
	@OneToMany(mappedBy = "todoItem")
	
	private List<Todo> todoList;

	private Date todoDate;

	public Integer getTodoItemId() {
		return todoItemId;
	}

	public void setTodoItemId(Integer todoItemId) {
		this.todoItemId = todoItemId;
	}

	public List<Todo> getTodoList() {
		return todoList;
	}

	public void setTodoList(List<Todo> todoList) {
		this.todoList = todoList;
	}

	public Date getTodoDate() {
		return todoDate;
	}

	public void setTodoDate(Date todoDate) {
		this.todoDate = todoDate;
	}

	@Override
	public String toString() {
		return "TodoItem [todoItemId=" + todoItemId + ", todoList=" + todoList + ", todoDate=" + todoDate + "]";
	}

}
