package com.microservices.tutorial.currencyexchangeservice.bean;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExchangeValue {

@Column(name="Currency_from")
private String from;
public int getPort() {
	return port;
}

public void setPort(int port) {
	this.port = port;
}

private int port;
public ExchangeValue(String from, String to, Long id, BigDecimal conversionMultiple) {
	super();
	this.from = from;
	this.to = to;
	this.id = id;
	this.conversionMultiple = conversionMultiple;
}

public String getFrom() {
	return from;
}

public void setFrom(String from) {
	this.from = from;
}

public String getTo() {
	return to;
}

public void setTo(String to) {
	this.to = to;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public BigDecimal getConversionMultiple() {
	return conversionMultiple;
}

public void setConversionMultiple(BigDecimal conversionMultiple) {
	this.conversionMultiple = conversionMultiple;
}

private String to;

@Id
private Long id;
private BigDecimal conversionMultiple;

public ExchangeValue() {
	
}
}
