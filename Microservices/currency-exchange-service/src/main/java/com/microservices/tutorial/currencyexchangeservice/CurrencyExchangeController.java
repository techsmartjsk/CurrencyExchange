package com.microservices.tutorial.currencyexchangeservice;

import java.math.BigDecimal;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.tutorial.currencyexchangeservice.bean.ExchangeValue;
import org.slf4j.Logger;

@RestController
public class CurrencyExchangeController {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	ExchangeValueRepo repository;
	@Autowired
	private Environment env;
    
	@GetMapping("/currency-exchange/from/{from}/to/{to}")	
    public ExchangeValue retrieveExchangeValue(@PathVariable String from,@PathVariable String to) {
	ExchangeValue exchangeValue = repository.findByFromAndTo(from, to);
	exchangeValue.setPort(Integer.parseInt(env.getProperty("local.server.port")));
	logger.info("{}",exchangeValue);
	return exchangeValue;
}
}
