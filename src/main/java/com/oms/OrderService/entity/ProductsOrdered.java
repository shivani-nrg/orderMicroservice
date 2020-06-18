package com.oms.OrderService.entity;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="productsordered")
public class ProductsOrdered {
	
	
	@EmbeddedId
	ProductsId productsId;
	@Column(name = "SELLERID",nullable=false)
	int sellerId;
	@Column(name = "QUANTITY",nullable=false)
	int quantity;
	@Column(name = "STATUS",nullable=false)
	String status;
	double price;
	public ProductsId getProductsId() {
		return productsId;
	}
	public void setProductsId(ProductsId productsId) {
		this.productsId = productsId;
	}
	public int getSellerId() {
		return sellerId;
	}
	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
	

	
}
