package com.oms.OrderService.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import com.oms.OrderService.dto.OrderDetailsDTO;
import com.oms.OrderService.dto.ProductsOrderedDTO;
import com.oms.OrderService.repository.OrderDetailsRepository;
import com.oms.OrderService.service.OrderService;


@RestController
@CrossOrigin
@RequestMapping(value="/api")
public class OrderServiceController {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	OrderService orderservice;

	@Autowired
	public OrderService orderService;
	
	@Autowired
	OrderDetailsRepository orderRepo;
	                                 
	@PostMapping(value = "/orderdetails/placeOrder",  consumes = MediaType.APPLICATION_JSON_VALUE)
	public String createCustomer(@RequestBody OrderDetailsDTO orderDTO) {
		logger.info("Creation request for customer {}", orderDTO);
		orderService.createCustomer(orderDTO);
		return "order placed successfully";
	}
	
	
	@GetMapping(value = "/orderdetails",  produces = MediaType.APPLICATION_JSON_VALUE)
	public List<OrderDetailsDTO> getAllOrders() {
		return orderService.getAllOrders();
	}
	
	
	@GetMapping(value= "/orderdetails/{orderId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public OrderDetailsDTO getSpecificOrder(@PathVariable Integer orderId) {
		return orderService.getSpecificOrders(orderId);
	}
	
	
	@GetMapping(value = "/productsordered",  produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ProductsOrderedDTO> getAllProducts() {
		return orderService.getAllProduct();
	}
	
	@DeleteMapping(value = "/orders/delete/{orderId}",consumes = MediaType.APPLICATION_JSON_VALUE)
	public void removeOrder(@PathVariable Integer orderId)
	{
	     orderRepo.deleteById(orderId);
	}
	
	@PutMapping(value="/update/{orderId}")
	public void updateOrder(@PathVariable("orderId") Integer prodId, @RequestBody OrderDetailsDTO orderDTO) {
		logger.info("Updating products in stock {}", orderDTO);
		orderService.updateOrder(orderDTO);
		
	}
	
}
