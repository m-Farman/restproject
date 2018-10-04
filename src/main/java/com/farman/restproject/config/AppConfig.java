package com.farman.restproject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

	@Bean
	freemarker.template.Configuration freeMarkerConfig() {
		freemarker.template.Configuration configuration = new freemarker.template.Configuration();
		return configuration;
	}

	@Bean
	public RestTemplate restTemplate() {
		int timeOut = 0;
		HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory();
		clientHttpRequestFactory.setConnectTimeout(timeOut);
		clientHttpRequestFactory.setReadTimeout(timeOut);
		clientHttpRequestFactory.setConnectionRequestTimeout(timeOut);
		RestTemplate restTemplate = new RestTemplate(clientHttpRequestFactory);
		return restTemplate;
	}

}
