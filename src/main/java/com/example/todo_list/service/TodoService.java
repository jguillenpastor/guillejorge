package com.example.todo_list.service;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.todo_list.model.Todo;
import com.example.todo_list.repository.TodoRepository;


@Service
public class TodoService implements ITodoService {

	@Autowired
	private TodoRepository todoRepository;

	@Override
	public List<Todo> getTodosByUser(String user) {
		return todoRepository.findByUserName(user);
	}

	@Override
	public Optional<Todo> getTodoById(long id) {
		return todoRepository.findById(id);
	}

	@Override
	public void updateTodo(Todo todo) {
		todoRepository.save(todo);
	}

	@Override
	public void addTodo(Long id,String name, String desc, Date targetDate,Date creationDate, Date finalizationDate, String todoLink,List<String> people, boolean isDone) {
		todoRepository.save(new Todo(id,name, desc, targetDate,creationDate,finalizationDate, todoLink,people,isDone));
	}

	@Override
	public void deleteTodo(long id) {
		Optional<Todo> todo = todoRepository.findById(id);
		if (todo.isPresent()) {
			todoRepository.delete(todo.get());
		}
	}

	@Override
	public void saveTodo(Todo todo) {
		todoRepository.save(todo);
	}
	
	//ojo como todo repository es quien tiene acceso a SQL y es privado pues hacemos esta funcion para poder acceder desde fuera
	@Override
	public List<Todo> getTodos() {
		return (todoRepository.findAll());
	}

}