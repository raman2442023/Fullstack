package com.example.bookstore;

import jakarta.persistence.*;

@Entity
public class Tasks {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	private String Task;
	private String Assign_To_Person;
	private String Date;
	private String Description;
	
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}
	public String getTask() {
		return Task;
	}
	public void setTask(String task) {
		Task = task;
	}
	public String getAssign_To_Person() {
		return Assign_To_Person;
	}
	public void setAssign_To_Person(String assign_To_Person) {
		Assign_To_Person = assign_To_Person;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	@Override
	public String toString() {
		return "Tasks [Id=" + Id + ", Task=" + Task + ", Assign_To_Person=" + Assign_To_Person + ", Date=" + Date
				+ ", Description=" + Description + "]";
	}
	
	
}
