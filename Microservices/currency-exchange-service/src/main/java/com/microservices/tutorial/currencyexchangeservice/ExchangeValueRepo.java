package com.microservices.tutorial.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.tutorial.currencyexchangeservice.bean.ExchangeValue;

public interface ExchangeValueRepo extends JpaRepository<ExchangeValue,Long> {
ExchangeValue findByFromAndTo(String from,String to);
}
