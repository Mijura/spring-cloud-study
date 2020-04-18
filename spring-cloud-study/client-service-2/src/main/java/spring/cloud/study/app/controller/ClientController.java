package spring.cloud.study.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.cloud.study.app.config.ConfigClient;

@RestController
public class ClientController {

	@Autowired
	private ConfigClient configClient;
	
	@GetMapping("/client/name")
	public String getClientName() {
		return configClient.getClientName();
	}
}
