package com.amelosbc.dsdeliver.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.amelosbc.dsdeliver.entities.Order;
import com.amelosbc.dsdeliver.entities.dto.OrderDTO;
import com.amelosbc.dsdeliver.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired   // injeção de dependencia via framework spring
	private OrderRepository repository;
	
	@Transactional(readOnly = true)
	public List<OrderDTO> findOrderWithProducts() {
		List<Order> list = repository.findAll();
		return list.stream().map(x -> new OrderDTO(x)).collect(Collectors.toList());
	}
}
