package com.microservices.tutorial.limitservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.tutorial.limitservice.bean.LimitConfiguration;
import com.microservices.tutorial.limitservice.Configuration;

@RestController
public class LimitConfigController {
	
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsFromConfiguration() {
	return new LimitConfiguration(configuration.getMaximum(),
			configuration.getMinimum());
	}
}
