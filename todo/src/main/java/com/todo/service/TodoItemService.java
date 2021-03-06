package com.todo.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.todo.model.TodoItem;
import com.todo.repository.TodoItemRepository;



@Service
public class TodoItemService {

	@Autowired 
	TodoItemRepository todoRepository;
	
	
	public List<TodoItem> get(){
		return todoRepository.findAll();
	}
	
	public List<TodoItem> findby(Date d) {
		return todoRepository.findByTodoDate(d);
	}
	
	public void inserttodo(TodoItem todoItem) {
		todoRepository.save(todoItem);
	}
}
