package com.example.todo_list.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.todo_list.model.Todo;



public interface TodoRepository extends JpaRepository<Todo, Long>{
	List<Todo> findByUserName(String user);
}