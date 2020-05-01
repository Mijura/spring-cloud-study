package spring.cloud.study.app.controller;

import org.springframework.web.bind.annotation.RestController;

import spring.cloud.study.contract.StudentService;

@RestController
public class StudentController implements StudentService {

	int numberOfStudents = 0;
	
	public int addStudent() {
		return ++numberOfStudents;
	}
}
