package com.oms.OrderService.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oms.OrderService.dto.OrderDetailsDTO;
import com.oms.OrderService.dto.ProductsOrderedDTO;
import com.oms.OrderService.entity.OrderDetails;
import com.oms.OrderService.entity.ProductsOrdered;
import com.oms.OrderService.repository.ProductsOrderedRepository;
import com.oms.OrderService.repository.OrderDetailsRepository;

@Service
public class OrderService {
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	public OrderDetailsRepository orderdetailsrepo;
	@Autowired
	public ProductsOrderedRepository productrepo;
	
	public List<OrderDetailsDTO> getAllOrders() {
		List<OrderDetails> order = orderdetailsrepo.findAll();
		List<OrderDetailsDTO> orderDTO = new ArrayList<>();

		for (OrderDetails orderDetails : order) {
			OrderDetailsDTO orderdetailsDTO = OrderDetailsDTO.valueOf(orderDetails);
			orderDTO.add(orderdetailsDTO);
		}

		logger.info("Order details : {}", orderDTO);
		return orderDTO;
	}

	public OrderDetailsDTO getSpecificOrders(Integer orderid) {
		return OrderDetailsDTO.valueOf(orderdetailsrepo.getOne(orderid));
	}

	public List<ProductsOrderedDTO> getAllProduct() {
		List<ProductsOrdered> products= productrepo.findAll();
		List<ProductsOrderedDTO> productsDTO = new ArrayList<>();
		
		for (ProductsOrdered productsOrder : products) {
			ProductsOrderedDTO proDTO = ProductsOrderedDTO.valueOf(productsOrder);
			productsDTO.add(proDTO);
		}
		logger.info("Order details : {}", productsDTO);
		return productsDTO;
		
	}

	public void createCustomer(OrderDetailsDTO orderDTO) {
		logger.info("Creation request for customer {}", orderDTO);
		OrderDetails order = orderDTO.createEntity();
		orderdetailsrepo.save(order);
		
		
	}
	
public void updateOrder(OrderDetailsDTO orderDTO) {
		
		OrderDetailsDTO orderDTO1=orderDTO;
		OrderDetails order=orderDTO1.createEntity();
		orderdetailsrepo.save(order);
	}

}
