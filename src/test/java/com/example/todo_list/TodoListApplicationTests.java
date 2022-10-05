package com.example.todo_list;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.Console;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.todo_list.model.Todo;
import com.example.todo_list.service.TodoService;

@SpringBootTest
class TodoListApplicationTests {

	
	TodoService todoService;
	/*@Test
	public void testTODOnotEmpty() {
		List<Todo> todoList = todoService.getTodos();
		for (Todo todo : todoList) {
			assertNotNull(todo.getDescription());

		}
	}*/
/*
	@Test
	public void testUpdateTodo() {
		
		Todo initialTodo = new  Todo(Long.valueOf("1"),"juan", "Po eso", new Date(), false);
		//todoService.updateTodo(initialTodo);
		java.util.Optional<Todo> optionalTodo = todoService.getTodoById(1);
		if (optionalTodo.isPresent()) {
			Todo expectedTodo = optionalTodo.get();
			
			assertEquals(expectedTodo.getDescription().toString(), initialTodo.getDescription());
		}
	}
*/
/*
	@Test
	public void testTODOupdateable() {
		TodoService todoService = new TodoService();
		Todo todoobj = new Todo(Long.valueOf("1"),"juan", "Po eso", new Date(), false);
		todoService.saveTodo(todoobj);
		todoService.getTodoById(1);
		assertEquals(todoobj.getDescription(), todoService.getTodoById(1).get().getDescription());
		int a=1;
		int b=1;
		assertEquals(a,b);
	}
*/
}
