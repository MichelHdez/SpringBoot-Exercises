package com.di.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.di.model.Student;
import com.di.repo.StudentRepo;
import com.di.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

	/*@Autowired
	private StudentRepo repo; //SINGLETON - es la mimsa instancia*/
	
	@Autowired
	private StudentService service;
	
	@PostMapping
	public void insertStudent(@RequestBody Student student) {
		//repo.insert(student);
		service.insertValidate(student);
	}
}
