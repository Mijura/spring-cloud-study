package spring.cloud.study.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	int numberOfStudents = 0;
	
	@GetMapping("student/add")
	public int addStudent() {
		return ++numberOfStudents;
	}
}
