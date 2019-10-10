package Microservice2.Bootstrap;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ServiceConfig {
	@Value("${quote}")
	private String qoute;
	
	public String getQuote() {
		return qoute;
	}
}
