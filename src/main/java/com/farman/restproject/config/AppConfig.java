package com.farman.restproject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	freemarker.template.Configuration freeMarkerConfig() {
		freemarker.template.Configuration configuration = new freemarker.template.Configuration();
		return configuration;
	}
}
