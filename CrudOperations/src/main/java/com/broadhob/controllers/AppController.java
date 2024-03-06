package com.broadhob.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.broadhob.Entity.Student;
import com.broadhob.services.StudentService;

@RestController
public class AppController {
	
	@Autowired
	StudentService studentservice;
	
	@PostMapping("/addstudent")
	public Student addstudent(@RequestBody Student student)
	{
		studentservice.saveStudent(student);
		return student;
	}
	
	@PostMapping("/addstudents")
	public List<Student> addstudent(@RequestBody List<Student> student)
	{
		studentservice.saveallStudents(student);
		return student;
	}
	
	@GetMapping("/students")
	public List<Student> getStudents()
	{
		return studentservice.getStudents();
	}
	
	@GetMapping("/showstudent/{id}")
	public Student getStudentByid(@PathVariable int id)
	{
		return studentservice.findById(id);
	}
	
	@PutMapping("/update")
	public Student update(@RequestBody Student student)
	{
		return studentservice.update(student);
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id)
	{
		return studentservice.delete(id);
	}
	
	@DeleteMapping("/deleteall")
	public String deleteall()
	{
		return studentservice.deleteall();
	}
	
	
	
	
	
	@RequestMapping("/home")
	public String home()
	{
		return "home";
	}
	
	@RequestMapping("/Register")
	public String register()
	{
				
		return "Register";
	}
	

}
