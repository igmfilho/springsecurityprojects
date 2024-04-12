package com.bharath.springcloud.rest.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.bharath.springcloud.rest.RestTemplateFactory;

@Configuration
@ComponentScan("com.bharath.springcloud.rest")
public class RestConfig {
	
	@Autowired
	private RestTemplateFactory restTemplateFactory;
	
	@Bean(name = "restTemplateBasicAuth")
	RestTemplate getRestTemplateForBasicAuth() {
		return restTemplateFactory.getObject();
	}
}
