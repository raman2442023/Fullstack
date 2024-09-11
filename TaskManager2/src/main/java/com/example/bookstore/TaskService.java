package com.example.bookstore;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

	@Autowired
	TaskDB taskservice;
	
	
	public void save(Tasks task) {
		taskservice.save(task);
	}
	
	public List<Tasks> getAllTask(){
		return taskservice.findAll();
	}
	
	public Tasks getTaskById(int Id) {
		return taskservice.findById(Id).get();
	}
	public void deleteById(int Id) {
		taskservice.deleteById(Id);
	}

}
