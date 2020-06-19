package com.microservices.tutorial.currencyconversionservice;

import java.math.BigDecimal;

public class CurrencyConversionBean {
String from;
private Long Id;
private int port;
private BigDecimal TotalCalculatedValue;
public int getPort() {
	return port;
}
public void setPort(int port) {
	this.port = port;
}
public BigDecimal getTotalCalculatedValue() {
	return TotalCalculatedValue;
}
public void setTotalCalculatedValue(BigDecimal totalCalculatedValue) {
	TotalCalculatedValue = totalCalculatedValue;
}
public BigDecimal getConversionMultiple() {
	return conversionMultiple;
}
public void setConversionMultiple(BigDecimal conversionMultiple) {
	this.conversionMultiple = conversionMultiple;
}
private BigDecimal conversionMultiple;
public Long getId() {
	return Id;
}
public void setId(Long id) {
	Id = id;
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
public BigDecimal getQuantity() {
	return quantity;
}
public void setQuantity(BigDecimal quantity) {
	this.quantity = quantity;
}
String to;
public CurrencyConversionBean(Long Id,String from, String to, BigDecimal quantity,BigDecimal conversionMultiple,int port,BigDecimal TotalCalculatedValue) {
	super();
	this.Id = Id;
	this.conversionMultiple = conversionMultiple;
	this.port = port;
	this.from = from;
	this.to = to;
	this.TotalCalculatedValue = TotalCalculatedValue;
	this.quantity = quantity;
}
BigDecimal quantity;
public CurrencyConversionBean() {
	
}


}
