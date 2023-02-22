package com.di.service;

import org.springframework.stereotype.Repository;

import com.di.model.Student;
import com.di.repo.StudentRepo;

@Repository //se utiliza al acceso a datos
public class StudentRepoImp implements StudentRepo{

	@Override
	public boolean insert(Student student) {
		System.out.println(student.toString());
		return true;
	}

}
