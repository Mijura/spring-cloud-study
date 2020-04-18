package spring.cloud.study.app.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@RefreshScope
@Component
public class ConfigClient {

	@Value("${client.name}")
	private String clientName;
	
	public String getClientName() {
		return "Client: " + clientName;
	}
}
