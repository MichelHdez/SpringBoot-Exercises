package com.di.service;

import java.time.LocalDate;
import java.time.Period;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.di.model.Student;
import com.di.repo.StudentRepo;

@Service
public class StudentServiceImp implements StudentService{

	@Autowired
	//@Qualifier ("studentRepoImp")
	private StudentRepo repo;
	
	@Override
	public boolean insertValidate(Student student) {
		int age = Period.between(student.getBirthday(), LocalDate.now()).getYears();
		return age >= 18 ? repo.insert(student) : false;
	}

}
