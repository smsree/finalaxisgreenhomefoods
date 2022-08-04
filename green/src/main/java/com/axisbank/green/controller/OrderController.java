package com.axisbank.green.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.axisbank.green.model.OrderMeals;
import com.axisbank.green.services.OrderService;

@RestController
@RequestMapping("/orders")
//@CrossOrigin("http://localhost:3000")
@CrossOrigin("http://ec2-54-213-102-2.us-west-2.compute.amazonaws.com:3000")
public class OrderController {
	@Autowired
	private OrderService orderService;
	
	
	public OrderService getOrderService() {
		return orderService;
	}
	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}
	@GetMapping("/all")
	public List<OrderMeals> getOrders(){
		return orderService.getAllOrder();
	}
	@GetMapping("/{id}")
	public OrderMeals getOrderByID(@PathVariable double id) {
		return orderService.getOrderById(id);
	}
	@PostMapping("/add")
	public ResponseEntity<String> addOrder(@RequestBody OrderMeals order)
	{
		return orderService.addOrder(order);
	}

}
