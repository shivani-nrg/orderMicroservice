package com.oms.OrderService.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ProductsId implements Serializable{
	@Column(name="ORDERID")
	public int orderId;
	@Column(name="PRODID")
	public int prodId;
	
	public ProductsId() {
		
	}
	public ProductsId(int orderId, int prodId) {
		this.orderId = orderId;
		this.prodId = prodId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + orderId;
		result = prime * result + prodId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductsId other = (ProductsId) obj;
		if (orderId != other.orderId)
			return false;
		if (prodId != other.prodId)
			return false;
		return true;
	}
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	

}
