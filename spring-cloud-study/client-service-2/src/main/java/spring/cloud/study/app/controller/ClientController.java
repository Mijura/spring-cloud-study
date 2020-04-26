package spring.cloud.study.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import spring.cloud.study.app.config.ConfigClient;

@RestController
public class ClientController {

	@Autowired
	private ConfigClient configClient;
	
	@Autowired
	private RestTemplate template;
	
	@GetMapping("/client/name")
	public String getClientName() {
		return configClient.getClientName();
	}
	
	@GetMapping("/addStudent")
	public int addStudent() {
		int numberOfStudents = template.getForObject("http://student-service/student/add", int.class);
		System.out.println(numberOfStudents);
		return numberOfStudents;
	}
}
