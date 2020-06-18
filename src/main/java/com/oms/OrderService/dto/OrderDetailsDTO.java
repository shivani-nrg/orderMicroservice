package com.oms.OrderService.dto;

import java.util.Date;

import com.oms.OrderService.entity.OrderDetails;

public class OrderDetailsDTO {
	int orderId;
	int buyerId;
	double amount;
	Date date;
	String address;
	String status;
	
	public OrderDetailsDTO() {
		super();
		
	}

	public OrderDetailsDTO(int orderId, int buyerId, double amount, Date date, String address, String status) {
		this();
		this.orderId = orderId;
		this.buyerId = buyerId;
		this.amount = amount;
		this.date = date;
		this.address = address;
		this.status = status;
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
	
	//converts entity into DTO
	public static OrderDetailsDTO valueOf(OrderDetails orderDetails) {
		OrderDetailsDTO ordersDTO=new OrderDetailsDTO();
		ordersDTO.setOrderId(orderDetails.getOrderId());
		ordersDTO.setBuyerId(orderDetails.getBuyerId());
		ordersDTO.setAmount(orderDetails.getAmount());
		ordersDTO.setDate(orderDetails.getDate());
		ordersDTO.setAddress(orderDetails.getAddress());
		ordersDTO.setStatus(orderDetails.getStatus());
		return ordersDTO;
		
	}
	public OrderDetails createEntity() {
		OrderDetails order = new OrderDetails();
		order.setAddress(this.getAddress());
		order.setAmount(this.getAmount());
		order.setBuyerId(this.getBuyerId());
		order.setDate(this.getDate());
		order.setOrderId(this.getOrderId());
		order.setStatus(this.getStatus());
		
		return order;
	}

	@Override
	public String toString() {
		return "OrderDetailsDTO [orderId=" + orderId + ", buyerId=" + buyerId + ", amount=" + amount + ", date=" + date
				+ ", address=" + address + ", status=" + status + "]";
	}
	
	
}
