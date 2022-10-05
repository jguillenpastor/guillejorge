package com.example.todo_list.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.todo_list.model.Todo;
import com.example.todo_list.repository.TodoRepository;

import net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition.Optional;

@SpringBootTest
class TodoServiceTest {
	
	@Autowired
	TodoService todoService;

	@Test
	public void testTODOnotEmpty() {
		List<Todo> todoList = todoService.getTodos();
		for (Todo todo : todoList) {
			assertNotNull(todo.getDescription());

		}
	}



	@Test
	public void testTODOupdateable() {
		Todo todoobj = new Todo(Long.valueOf("1"),"juan", "Po eso", new Date(), new Date(),false);
		todoService.saveTodo(todoobj);
		assertEquals(todoobj.getDescription(), todoService.getTodoById(1).get().getDescription());

	}
	
	@Test
	public void testTODOremuvable() {
		Todo todoobj = new Todo(Long.valueOf("1"),"juan", "Po eso", new Date(),new Date(), false);
		todoService.saveTodo(todoobj);
		todoService.deleteTodo(1);
		assertTrue(!todoService.getTodoById(1).isPresent()); ;

	}
	
	@Test
	public void AddCreationDate() {
		Todo todoobj = new Todo(Long.valueOf("1"),"juan", "Po eso", new Date(), new Date(),false);
		todoService.saveTodo(todoobj);
		Date date= todoService.getTodoById(1).get().getcreationDate();
		assertEquals(todoobj.getcreationDate(), date);
	}
		//assert.assertTrue(!todoService.getTodoById(1).isPresent()); ;

	@Test
	public void AddFinalizationDate() {
		//añadir finalizarion date a Todo
	}
	
	@Test
	public void AddLink() {
		//add link a todo y comprobar q al meterlo está
	}
	
	@Test
	public void DifferentationLinks() {
		//
	}
	////////////////////////////////////////////////////////////*
	/*
	 	@Test
	public void testDescriptionNotEmpty() {
		List<Todo> todoList = todoService.getTodos();
		for (Todo todo : todoList) {
			assertNotNull(todo.getDescription(), "Assert not null");
		}
	}
	@Test
	public void testUpdateTodo() {
		Todo initialTodo = new Todo("alfredo", "desc", new Date(), false);
		todoService.updateTodo(initialTodo);
		java.util.Optional<Todo> optionalTodo = todoService.getTodoById(1);
		if (optionalTodo.isPresent()) {
			Todo expectedTodo = optionalTodo.get();
			assertEquals(expectedTodo.getDescription(), initialTodo.getDescription());
		}
	}

	@Test
	public void testDeleteTodo() {
		todoService.deleteTodo(1);
		Optional<Todo> optionalTodo = todoService.getTodoById(1);
		assert !optionalTodo.isPresent();
	}

	@Test
	public void testDescriptionDoesNotBeginWith() {
		String chars = "@#";
		List<Todo> todoList = todoService.getTodos();
		for (Todo todo : todoList) {
			assertNotEquals(todo.getDescription().charAt(0), '@');
			assertNotEquals(todo.getDescription().charAt(0), '#');
		}
	}
	////////////////////
	 * */
	 

}
