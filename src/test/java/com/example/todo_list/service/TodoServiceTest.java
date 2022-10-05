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
		Todo todoobj = new Todo(Long.valueOf("1"),"juan", "Po eso", new Date(), new Date(), new Date(), "link wec", false);
		todoService.saveTodo(todoobj);
		assertEquals(todoobj.getDescription(), todoService.getTodoById(1).get().getDescription());

	}
	
	@Test
	public void testTODOremuvable() {
		Todo todoobj = new Todo(Long.valueOf("1"),"juan", "Po eso", new Date(),new Date(),new Date(), "link wec", false);
		todoService.saveTodo(todoobj);
		todoService.deleteTodo(1);
		assertTrue(!todoService.getTodoById(1).isPresent());
	}
	
	@Test
	public void testAddCreationDate() {
		Todo todoobj = new Todo(Long.valueOf("1"),"juan", "Po eso", new Date(), new Date(),new Date(), "link wec",false);
		todoService.saveTodo(todoobj);
		Date date= todoService.getTodoById(1).get().getCreationDate();
		assertEquals(todoobj.getCreationDate(), date);
	}
		//assert.assertTrue(!todoService.getTodoById(1).isPresent()); ;

	@Test
	public void testAddFinalizationDate() {
		Todo todoobj = new Todo(Long.valueOf("1"),"juan", "Po eso", new Date(), new Date(), new Date(), "link wec",false);
		todoService.saveTodo(todoobj);
		Date date= todoService.getTodoById(1).get().getCreationDate();
		assertEquals(todoobj.getCreationDate(), date);
	}
	
	@Test
	public void testAddLink() {
		Todo todoobj = new Todo(Long.valueOf("1"),"juan", "Po eso", new Date(), new Date(), new Date(), "link wec",false);
		todoService.saveTodo(todoobj);
		String link= todoService.getTodoById(1).get().getTodoLink();
		assertEquals(todoobj.getTodoLink(), link);
	}
	
	@Test
	public void testDifferentationLinks() {
		//pillas dos links y miras si son iguales o diferentes
	}



}
