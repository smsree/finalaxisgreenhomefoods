package com.axisbank.green.services;
import java.util.List;

import org.springframework.http.ResponseEntity;

import com.axisbank.green.model.*;
public interface OrderService {
	public List<OrderMeals> getAllOrder();
	public ResponseEntity<String> addOrder(OrderMeals o);
	public OrderMeals getOrderById(double id);
	
}