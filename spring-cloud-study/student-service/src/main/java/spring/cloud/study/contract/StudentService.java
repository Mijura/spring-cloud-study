package spring.cloud.study.contract;

import org.springframework.web.bind.annotation.GetMapping;

public interface StudentService {
	
	@GetMapping("student/add")
	public int addStudent();

}
