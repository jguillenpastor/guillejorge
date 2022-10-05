package com.example.todo_list.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "todos")
public class Todo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String userName;

	private String description;

	private Date targetDate;

	private Date creationDate;

	private Date finalizationDate;

	private  String todoLink;

	private List<String> people;
	private Boolean isDone;
	public Todo() {
	}

	public Todo(long id, String userName, String description, Date targetDate, Date creationDate, Date finalizationDate, String todoLink, List<String> people, Boolean isDone) {
		this.id = id;
		this.userName = userName;
		this.description = description;
		this.targetDate = targetDate;
		this.creationDate = creationDate;
		this.finalizationDate = finalizationDate;
		this.todoLink = todoLink;
		this.people = people;
		this.isDone = isDone;
	}

	public List<String> getPeople() {
		return people;
	}

	public void setPeople(List<String> people) {
		this.people = people;
	}

	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTodoLink() {
		return this.todoLink;
	}

	public void setTodoLink(String todoLink) {
		this.todoLink = todoLink;
	}

	public Date getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getFinalizationDate() {
		return finalizationDate;
	}

	public void setFinalizationDate(Date finalizationDate) {
		this.finalizationDate = finalizationDate;
	}

	public boolean getIsDone() {
		return isDone;
	}

	public void setIsDone(boolean isDone) {
		this.isDone = isDone;
	}


}
