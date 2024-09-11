package com.example.bookstore;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TaskController {

	
	@Autowired
	TaskService service;
	
	@GetMapping("/")
	public String home() {
		return "Home";
	}
	
	@GetMapping("/addTask")
	public String addTask() {
		return "AddTask";
	}
	
	@GetMapping("/viewTasks")
	public ModelAndView viewTask() {
		List <Tasks> list = service.getAllTask();
		ModelAndView mav = new ModelAndView();
		mav.addObject("taskDetails", list);
		mav.setViewName("ViewTask");
		
		return mav;
	}
	@PostMapping("/saveTask")
	public String saveTask(@ModelAttribute Tasks task) {
		service.save(task);
		return "redirect:/viewTasks";
	}
	@RequestMapping("/editTask/{Id}")
	public String editTask(@PathVariable("Id") int Id,Model model) {
		Tasks t = service.getTaskById(Id);
		model.addAttribute("task",t);
		return "EditTask";
	}
	
	@RequestMapping("/deleteTask/{Id}")
	public String deleteBook(@PathVariable("Id")int Id) {
		service.deleteById(Id);
		return "redirect:/viewTasks";
	}
	
	
	
	
	
	
	
	
	
	
}
