package com.axisbank.green.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.axisbank.green.repository.OrderRepostiory;
import com.axisbank.green.model.*;
@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderRepostiory orderRepository;
	
	@Override
	public List<OrderMeals> getAllOrder() {
		return  orderRepository.findAll();
	}

	@Override
	public ResponseEntity<String> addOrder(OrderMeals o) {
		orderRepository.save(o);
		return new ResponseEntity<String>("order added successfully",HttpStatus.OK);
	}

	@Override
	public OrderMeals getOrderById(double id) {
		return orderRepository.findById(id).get();
	}

}
