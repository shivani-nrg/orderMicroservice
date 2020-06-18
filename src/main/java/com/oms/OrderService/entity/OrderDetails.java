package com.oms.OrderService.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;


@Entity
@Table(name="orderdetails")
public class OrderDetails {
	
	@Id
	@Column(name = "ORDERID",nullable=false)
	int orderId;
	@Column(name = "BUYERID",nullable=false)
	int buyerId;
	@Column(name = "AMOUNT",nullable=false)
	double amount;
	@Column(name = "DATE")
	Date date;
	@Column(name = "ADDRESS",nullable=false)
	String address;
	@Column(name = "STATUS",nullable=false)
	String status;

	
	public OrderDetails() {
		super();
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(int buyerId) {
		this.buyerId = buyerId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	


}
