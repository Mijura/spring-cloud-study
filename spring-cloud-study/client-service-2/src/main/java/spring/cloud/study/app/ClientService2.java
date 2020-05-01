package spring.cloud.study.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ClientService2 {

	public static void main(String[] args) {
		SpringApplication.run(ClientService2.class, args);
	}

}
