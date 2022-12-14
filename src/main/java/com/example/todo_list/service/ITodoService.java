package com.example.todo_list.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.example.todo_list.model.Todo;

public interface ITodoService {

	List<Todo> getTodosByUser(String user);

	Optional<Todo> getTodoById(long id);

	void updateTodo(Todo todo);

	void addTodo(Long id, String name, String desc, Date targetDate, Date creationDate, Date finalizationDate, String todoLink, ArrayList<String> people, boolean isDone);

	void deleteTodo(long id);
	
	void saveTodo(Todo todo);

	List<Todo> getTodos();

	void addTodo(Long id, String name, String desc, Date targetDate, Date creationDate, Date finalizationDate, String todoLink,List<String> people, boolean isDone);

}