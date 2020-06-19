package com.microservices.tutorial.currencyconversionservice;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CurrencyConversionController {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	CurrencyExchangeServiceProxy proxy;
	
	@GetMapping("/currency-converter-feign/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean convertCurrencyFeign(
			@PathVariable String from,
			@PathVariable String to,
			@PathVariable BigDecimal quantity) {
	CurrencyConversionBean response = proxy.retrieveExchangeValue(from, to);
		
	logger.info("{}",response);
		return new CurrencyConversionBean(response.getId(),from,to,quantity,response.getConversionMultiple(),response.getPort(),quantity.multiply(response.getConversionMultiple()));
	}
}
